package com.projeto.pizzaria.repository;

import com.projeto.pizzaria.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository <Product, UUID> {

}

