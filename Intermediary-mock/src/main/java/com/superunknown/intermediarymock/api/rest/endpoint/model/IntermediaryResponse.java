package com.superunknown.intermediarymock.api.rest.endpoint.model;

import java.io.Serial;
import java.io.Serializable;

public class IntermediaryResponse<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 956663826767654406L;

    private String message;
    private T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
