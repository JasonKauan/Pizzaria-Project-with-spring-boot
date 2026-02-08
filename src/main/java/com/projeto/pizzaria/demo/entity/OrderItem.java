package com.projeto.pizzaria.demo.entity;


import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "order_items")
public class OrderItem {

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;


    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    private Integer quantity;
    private Double price;





    public OrderItem() {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
