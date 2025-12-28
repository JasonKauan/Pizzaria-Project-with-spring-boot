package com.projeto.pizzaria.demo.entity;

import jakarta.persistence.OneToOne;

import java.util.UUID;

public class CustomerInfo {

    private UUID id;

    private String phone;
    private String address;
    private String observation;

    @OneToOne
    private Order order;
}
