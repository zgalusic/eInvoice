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
    private InvoiceStatus invoiceStatus;

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

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    @Override
    public String toString() {
        return "InvoiceDto{" +
                "id='" + id + '\'' +
                ", customerId='" + customerId + '\'' +
                ", totalAmount=" + totalAmount +
                ", invoiceStatus=" + invoiceStatus +
                '}';
    }
}
