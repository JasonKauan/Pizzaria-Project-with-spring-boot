package com.projeto.pizzaria.demo.repository;

import com.projeto.pizzaria.demo.entity.Order;
import com.projeto.pizzaria.demo.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OrderItemRepository extends JpaRepository<OrderItem,UUID> {
    List<OrderItem> findByOrder(Order order);
    List<OrderItem> findByOrderId(UUID orderId);


}
