package com.example.demo.Controller.MP;

import com.example.demo.Entity.Pedido;
import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.preference.PreferenceBackUrlsRequest;
import com.mercadopago.client.preference.PreferenceClient;
import com.mercadopago.client.preference.PreferenceItemRequest;
import com.mercadopago.client.preference.PreferenceRequest;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.preference.Preference;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "api")
public class MercadoPagoController {

    @PostMapping("/create_preference_mp")
    public PreferenceMp getPreferenciaIdMercadoPago(@RequestBody Pedido pedido) throws MPException {
        try {
            MercadoPagoConfig.setAccessToken("TEST-8608807350082977-052522-18faef8db05bcfe7fdd16e4cd61c4d83-709674948");
            PreferenceItemRequest itemRequest = PreferenceItemRequest.builder()
                    .id("1234")
                    .title("NegoZona")
                    .description("Pedido realizado desde el carrito de compras")
                    .pictureUrl("https://www.shutterstock.com/image-photo/set-different-musical-instruments-on-260nw-2021399690.jpg")
                    .quantity(1)
                    .currencyId("ARG")
                    .unitPrice(new BigDecimal(pedido.getTotal()))
                    .build();
            List<PreferenceItemRequest> items = new ArrayList<>();
            items.add(itemRequest);

            PreferenceBackUrlsRequest backURL = PreferenceBackUrlsRequest.builder().success("http://localhost:5173/mpsuccess")
                    .pending("http://localhost:5173/mppending").failure("http://localhost:5173/mpfailure").build();

            PreferenceRequest preferenceRequest = PreferenceRequest.builder()
                    .items(items)
                    .backUrls(backURL)
                    .build();
            PreferenceClient client = new PreferenceClient();
            Preference preference = client.create(preferenceRequest);

            PreferenceMp mpPreference = new PreferenceMp();
            mpPreference.setStatusCode(preference.getResponse().getStatusCode());
            mpPreference.setId(preference.getId());
            return mpPreference;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
