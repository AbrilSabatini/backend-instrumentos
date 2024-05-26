package com.example.demo.Controller;

import com.example.demo.Entity.PedidoDetalle;
import com.example.demo.Service.InstrumentoServiceImpl;
import com.example.demo.Service.PedidoDetalleServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "detalles")
public class PedidoDetalleController extends BaseControllerImpl<PedidoDetalle, PedidoDetalleServiceImpl> {
    public PedidoDetalleController(PedidoDetalleServiceImpl servicio) {
        super(servicio);
    }
}
