package com.gustavosdaniel.microservicoPedido.service;

import com.gustavosdaniel.microservicoPedido.model.ItemPedido;
import com.gustavosdaniel.microservicoPedido.model.Pedido;
import com.gustavosdaniel.microservicoPedido.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido salvarPedido(Pedido pedido) {
        if (pedido.getId() == null) { // se o pedido for null
            for (ItemPedido itemPedido : pedido.getItens()) {
                itemPedido.setPedido(pedido);  // vai adicionando os itens na lista de pedidos
            }
        }
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}
