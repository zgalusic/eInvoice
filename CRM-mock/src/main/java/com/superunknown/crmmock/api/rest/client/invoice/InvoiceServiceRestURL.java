package com.superunknown.crmmock.api.rest.client.invoice;

public enum InvoiceServiceRestURL {

    UPDATE_CUSTOMER("", "/customer");
    private final String description;
    private final String url;

    InvoiceServiceRestURL(String description, String url) {
        this.description = description;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }
}
