package com.upc.demosys.model;

import java.util.Date;

public class Reportcard {
    private String cid;

    private String sid;

    private Date starttime;

    private String cname;

    private Integer grades;

    public Reportcard(String cid, String sid, Date starttime, String cname, Integer grades) {
        this.cid = cid;
        this.sid = sid;
        this.starttime = starttime;
        this.cname = cname;
        this.grades = grades;
    }

    public Reportcard() {
        super();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
    }
}