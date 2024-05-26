package com.example.demo.Service;

import com.example.demo.Entity.Instrumento;
import com.example.demo.Entity.Pedido;
import com.example.demo.Repository.BaseRepository;
import com.example.demo.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements IPedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository) throws Exception {
        super(baseRepository);
    }

    @Override
    public Pedido save(Pedido pedido) throws Exception {
        pedido.getDetalles().forEach(detalle -> detalle.setPedido(pedido));
        return pedidoRepository.save(pedido);
    }
}
