package com.projeto.pizzaria.demo.service;

import java.util.UUID;
import com.projeto.pizzaria.demo.entity.Order;
import com.projeto.pizzaria.demo.entity.User;
import com.projeto.pizzaria.demo.enums.OrderStatus;
import com.projeto.pizzaria.demo.repository.OrderRepository;
import com.projeto.pizzaria.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    public OrderService(OrderRepository orderRepository, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    public Order createOrder(UUID userId, BigDecimal total){
        User userEntity = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Order order = new Order();
        order.setUser(userEntity);
        order.setStatus(OrderStatus.PENDING);
        order.setCreateAt(LocalDateTime.now());
        order.setEstimatedDeliveryTime(LocalDateTime.now().plusMinutes(60));
        order.setTotal(total);

        return orderRepository.save(order);
    }

    public Order updateOrderStatus(UUID orderId, OrderStatus newStatus) {
        Order order = orderRepository.findById(orderId).orElse(null);
        if (order != null && order.getStatus().canChangeTo(newStatus)) {
            order.setStatus(newStatus);
            return orderRepository.save(order);
        }
        return null;
    }

    public Order getOrderById(UUID id){
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }
}
