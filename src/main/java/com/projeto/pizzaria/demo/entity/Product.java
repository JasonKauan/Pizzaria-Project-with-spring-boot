package com.projeto.pizzaria.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private UUID id;


    private String name;
    private String description;
    private BigDecimal price;
    private String caregory;
    private Boolean active = true;


}
