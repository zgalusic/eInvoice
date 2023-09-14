package com.superunknown.crmmock.business.model;

import java.io.Serial;
import java.io.Serializable;

public class Customer implements Serializable {

    @Serial
    private static final long serialVersionUID = -6516209797715035830L;

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
