package com.projeto.pizzaria.demo.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

public class CreateOrderRequest {

    @NotNull
    private UUID userId;

    @NotEmpty
    @Valid
    private List<OrderItemRequest> items;

    // Getters and Setters


    public List<OrderItemRequest> getItems() {
        return items;
    }

    public void setItems(List<OrderItemRequest> items) {
        this.items = items;
    }

    public UUID getUserId() {
        return userId;
    }
}
