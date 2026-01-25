package com.projeto.pizzaria.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem {

    private final Order order;




    public OrderItem(Order order) {
        this.order = order;
    }
}
