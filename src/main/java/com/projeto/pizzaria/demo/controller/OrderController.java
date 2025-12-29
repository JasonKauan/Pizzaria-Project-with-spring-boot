package com.projeto.pizzaria.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/orders")
public class OrderController {
    public ResponseEntity<String> createOrder() {
        return ResponseEntity.ok("Pedido Criado com Sucesso!");
    }

}
