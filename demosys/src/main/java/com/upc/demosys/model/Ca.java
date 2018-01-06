package com.upc.demosys.model;

import java.util.Date;

public class Ca {
    private String couCid;

    private Date starttime;

    private Date enditme;

    public Ca(String couCid, Date starttime, Date enditme) {
        this.couCid = couCid;
        this.starttime = starttime;
        this.enditme = enditme;
    }

    public Ca() {
        super();
    }

    public String getCouCid() {
        return couCid;
    }

    public void setCouCid(String couCid) {
        this.couCid = couCid == null ? null : couCid.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEnditme() {
        return enditme;
    }

    public void setEnditme(Date enditme) {
        this.enditme = enditme;
    }
}