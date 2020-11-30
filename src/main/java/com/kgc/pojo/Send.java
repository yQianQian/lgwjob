package com.kgc.pojo;

import java.util.Date;

public class Send {
    private Integer id;

    private Integer rid;

    private Integer jid;

    private Date sendtime;

    private Integer rucid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getRucid() {
        return rucid;
    }

    public void setRucid(Integer rucid) {
        this.rucid = rucid;
    }
}