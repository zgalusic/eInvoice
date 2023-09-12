package com.superunknown.einvoicebusiness.api.rest.client.crm;

public enum CrmRestURL {

    CUSTOMER_DATA("Fetch customer data via unique ID", "/{id}");

    private final String description;
    private final String url;

    CrmRestURL(String description, String url) {
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
