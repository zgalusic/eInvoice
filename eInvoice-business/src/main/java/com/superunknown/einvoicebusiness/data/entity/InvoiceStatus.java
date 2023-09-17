package com.superunknown.einvoicebusiness.data.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "invoice_status")
public class InvoiceStatus {

    @Id
    private Long id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy="invoiceStatus")
    private Set<Invoice> invoices = new HashSet<>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }
}
