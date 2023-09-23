package com.superunknown.erpmock.api.rest.client.invoice.model;

import java.io.Serial;
import java.io.Serializable;

public class InvoiceResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 2060639341443353669L;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
