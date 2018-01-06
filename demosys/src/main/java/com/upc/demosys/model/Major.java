package com.upc.demosys.model;

public class Major {
    private String mId;

    private String coId;

    private String mName;

    private Integer mNum;

    public Major(String mId, String coId, String mName, Integer mNum) {
        this.mId = mId;
        this.coId = coId;
        this.mName = mName;
        this.mNum = mNum;
    }

    public Major() {
        super();
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId == null ? null : coId.trim();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmNum() {
        return mNum;
    }

    public void setmNum(Integer mNum) {
        this.mNum = mNum;
    }
}