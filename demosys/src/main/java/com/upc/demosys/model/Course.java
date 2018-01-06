package com.upc.demosys.model;

public class Course {
    private String cid;

    private String cname;

    private Float credit;

    public Course(String cid, String cname, Float credit) {
        this.cid = cid;
        this.cname = cname;
        this.credit = credit;
    }

    public Course() {
        super();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }
}