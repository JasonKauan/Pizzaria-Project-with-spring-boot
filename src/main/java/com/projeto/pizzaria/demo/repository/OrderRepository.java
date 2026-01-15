package com.projeto.pizzaria.demo.repository;

import com.projeto.pizzaria.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
