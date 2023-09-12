package com.superunknown.einvoicebusiness.api.rest.client.crm;

public enum QueryParameter {
    ID("id");

    private final String name;

    QueryParameter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
