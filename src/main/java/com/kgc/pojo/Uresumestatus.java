package com.kgc.pojo;

public class Uresumestatus {
    private Integer id;

    private String urstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrstatus() {
        return urstatus;
    }

    public void setUrstatus(String urstatus) {
        this.urstatus = urstatus == null ? null : urstatus.trim();
    }
}