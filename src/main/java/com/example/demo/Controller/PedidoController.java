package com.example.demo.Controller;

import com.example.demo.Entity.Pedido;
import com.example.demo.Service.PedidoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl> {

    @Autowired
    PedidoServiceImpl pedidoService;

    public PedidoController(PedidoServiceImpl servicio) {
        super(servicio);
    }

    @Override
    public ResponseEntity<?> save(Pedido pedido) {
        try {
            pedido.getDetalles().forEach(detalle -> detalle.setPedido(pedido));
            Pedido savedPedido = pedidoService.save(pedido);
            return ResponseEntity.ok(savedPedido);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al guardar el pedido: " + e.getMessage());
        }
    }
}
