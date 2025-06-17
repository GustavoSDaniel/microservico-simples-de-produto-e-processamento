package com.gustavosdaniel.microservicoPedido.repository;

import com.gustavosdaniel.microservicoPedido.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
