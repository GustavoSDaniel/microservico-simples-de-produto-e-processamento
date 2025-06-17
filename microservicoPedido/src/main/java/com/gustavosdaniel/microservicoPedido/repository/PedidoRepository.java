package com.gustavosdaniel.microservicoPedido.repository;

import com.gustavosdaniel.microservicoPedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
