package com.kgc.pojo;

public class Cresurmestatus {
    private Integer id;

    private String crstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCrstatus() {
        return crstatus;
    }

    public void setCrstatus(String crstatus) {
        this.crstatus = crstatus == null ? null : crstatus.trim();
    }
}