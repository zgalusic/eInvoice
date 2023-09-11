package com.superunknown.intermediarymock.business.model;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Invoice implements Serializable {

    @Serial
    private static final long serialVersionUID = -2662503678639940423L;

    private String id;
    private String customerName;
    private BigDecimal totalAmount;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
