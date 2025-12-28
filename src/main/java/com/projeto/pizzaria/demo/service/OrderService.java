package com.projeto.pizzaria.demo.service;


import com.projeto.pizzaria.demo.entity.Order;
import com.projeto.pizzaria.demo.entity.User;
import com.projeto.pizzaria.demo.enums.OrderStatus;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

import java.math.BigDecimal;
import java.time.Instant;

@Service
public class OrderService {

    public Order createorder(User user, BigDecimal total){
        Order order = new Order();
        order.setUser(user);
        order.setStatus(OrderStatus.PENDING);
        order.setCreateAt(LocalDateTime.now());
        order.setEstimatedDeliveryTime(LocalDateTime.now().plusMinutes(60));
        order.setTotal(total);

        return order;
    };
}
