package com.upc.demosys.model;

public class Classes {
    private Integer clId;

    private Integer clNum;

    private String clName;

    private String mId;

    public Classes(Integer clId, Integer clNum, String clName, String mId) {
        this.clId = clId;
        this.clNum = clNum;
        this.clName = clName;
        this.mId = mId;
    }

    public Classes() {
        super();
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public Integer getClNum() {
        return clNum;
    }

    public void setClNum(Integer clNum) {
        this.clNum = clNum;
    }

    public String getClName() {
        return clName;
    }

    public void setClName(String clName) {
        this.clName = clName == null ? null : clName.trim();
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }
}