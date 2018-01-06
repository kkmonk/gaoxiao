package com.upc.demosys.model;

public class SeconedMajor {
    private String sid;

    private String mId;

    private String type;

    public SeconedMajor(String sid, String mId, String type) {
        this.sid = sid;
        this.mId = mId;
        this.type = type;
    }

    public SeconedMajor() {
        super();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}