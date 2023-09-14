package com.superunknown.crmmock.api.rest.client.invoice.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serial;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoiceResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 4464551913879871458L;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
