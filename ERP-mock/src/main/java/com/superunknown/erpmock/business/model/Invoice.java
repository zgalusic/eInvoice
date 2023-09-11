package com.superunknown.erpmock.business.model;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Invoice implements Serializable {
    @Serial
    private static final long serialVersionUID = -31147543020455473L;

    private String id;
    private String customerId;
    private BigDecimal totalAmount;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}