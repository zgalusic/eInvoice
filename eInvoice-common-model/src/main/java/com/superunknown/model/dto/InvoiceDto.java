package com.superunknown.model.dto;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class InvoiceDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 2115116446564092751L;
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

    @Override
    public String toString() {
        return "InvoiceDto{" +
                "id='" + id + '\'' +
                ", customerId='" + customerId + '\'' +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
