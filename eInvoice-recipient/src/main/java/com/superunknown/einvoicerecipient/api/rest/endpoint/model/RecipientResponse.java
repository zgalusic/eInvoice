package com.superunknown.einvoicerecipient.api.rest.endpoint.model;

import java.io.Serial;
import java.io.Serializable;

public class RecipientResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = -5137556721111313207L;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
