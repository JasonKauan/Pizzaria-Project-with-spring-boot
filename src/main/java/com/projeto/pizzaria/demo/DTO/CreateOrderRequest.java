package com.projeto.pizzaria.demo.DTO;

import java.math.BigDecimal;
import java.util.UUID;

public class CreateOrderRequest {
    private UUID userId;
    private BigDecimal total;

    // Getters and Setters

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

}
