package com.projeto.pizzaria.entities;

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
