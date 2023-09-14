package com.superunknown.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serial;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto implements Serializable {

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
