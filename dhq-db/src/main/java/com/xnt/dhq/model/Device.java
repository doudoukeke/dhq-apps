package com.xnt.dhq.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by afu on 2019-03-19.
 */

public class Device implements Serializable {
    private Long id;

    private String name;

    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
