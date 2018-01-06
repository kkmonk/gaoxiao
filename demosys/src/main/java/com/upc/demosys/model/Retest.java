package com.upc.demosys.model;

import java.util.Date;

public class Retest {
    private String sid;

    private String cid;

    private Date reDate;

    public Retest(String sid, String cid, Date reDate) {
        this.sid = sid;
        this.cid = cid;
        this.reDate = reDate;
    }

    public Retest() {
        super();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Date getReDate() {
        return reDate;
    }

    public void setReDate(Date reDate) {
        this.reDate = reDate;
    }
}