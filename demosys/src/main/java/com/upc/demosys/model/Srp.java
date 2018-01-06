package com.upc.demosys.model;

public class Srp {
    private String sid;

    private String pId;

    private String rId;

    public Srp(String sid, String pId, String rId) {
        this.sid = sid;
        this.pId = pId;
        this.rId = rId;
    }

    public Srp() {
        super();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId == null ? null : rId.trim();
    }
}