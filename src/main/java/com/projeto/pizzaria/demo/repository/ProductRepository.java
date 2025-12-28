package com.projeto.pizzaria.demo.repository;

import com.projeto.pizzaria.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository <Product, UUID> {

}

