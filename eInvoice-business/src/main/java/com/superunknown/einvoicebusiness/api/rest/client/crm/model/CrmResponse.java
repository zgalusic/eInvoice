package com.superunknown.einvoicebusiness.api.rest.client.crm.model;

import java.io.Serial;
import java.io.Serializable;

public class CrmResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 6786159750052636885L;

    private String message;
    private Customer data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Customer getData() {
        return data;
    }

    public void setData(Customer data) {
        this.data = data;
    }
}
