package com.superunknown.model.dto;

import java.io.Serial;
import java.io.Serializable;

public class InvoiceStatusDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -1172576403138164572L;
    private long id;
    private String name;

    public InvoiceStatusDto(){}

    public InvoiceStatusDto(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
