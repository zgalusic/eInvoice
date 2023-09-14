package com.superunknown.crmmock.api.rest.client;

import java.io.Serial;

public class RestClientGeneralException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -1036546627476033310L;
    private final String statusCode;
    private final String statusText;

    public RestClientGeneralException(String message) {
        super(message);
        this.statusCode = null;
        this.statusText = null;
    }

    public RestClientGeneralException(Throwable cause) {
        super(cause);
        this.statusCode = null;
        this.statusText = null;
    }

    public RestClientGeneralException(String statusCode, String statusText) {
        this.statusCode = statusCode;
        this.statusText = statusText;
    }

    public RestClientGeneralException(String message, String statusCode, String statusText) {
        super(message);
        this.statusCode = statusCode;
        this.statusText = statusText;
    }

    public RestClientGeneralException(String message, Throwable cause, String statusCode, String statusText) {
        super(message, cause);
        this.statusCode = statusCode;
        this.statusText = statusText;
    }

    public RestClientGeneralException(Throwable cause, String statusCode, String statusText) {
        super(cause);
        this.statusCode = statusCode;
        this.statusText = statusText;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getStatusText() {
        return statusText;
    }
}
