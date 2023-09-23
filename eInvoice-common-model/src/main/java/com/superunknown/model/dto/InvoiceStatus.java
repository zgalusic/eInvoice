package com.superunknown.model.dto;

public enum InvoiceStatus {
    INCOMPLETE_DATA(1, "Incomplete data"),
    READY(2, "Ready"),
    SENT(3, "Sent"),
    DELIVERED(4, "Delivered"),
    FAILED(5, "Failed"),
    DELIVERED_SENT(6, "Delivered-Sent"),
    FAILED_SENT(7, "Failed-Sent"),
    DELIVERED_NOTIFIED(8, "Delivered-Notified"),
    FAILED_NOTIFIED(9, "Failed-Notified"),;

    private final int id;
    private final String name;

    InvoiceStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static InvoiceStatus findById(int id) {
        for (InvoiceStatus enumConstant : values()) {
            if (enumConstant.getId() == id) {
                return enumConstant;
            }
        }
        throw new IllegalArgumentException("No enum constant with ID " + id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
