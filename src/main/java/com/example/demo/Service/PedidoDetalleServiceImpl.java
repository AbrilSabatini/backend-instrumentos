package com.example.demo.Service;

import com.example.demo.Entity.Pedido;
import com.example.demo.Entity.PedidoDetalle;
import com.example.demo.Repository.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoDetalleServiceImpl extends BaseServiceImpl<PedidoDetalle, Long> implements IPedidoDetalleService{

    public PedidoDetalleServiceImpl(BaseRepository<PedidoDetalle, Long> baseRepository) throws Exception {
        super(baseRepository);
    }
}
