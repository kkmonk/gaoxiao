package com.upc.demosys.model;

public class College {
    private String coId;

    private String coName;

    private Integer coNum;

    public College(String coId, String coName, Integer coNum) {
        this.coId = coId;
        this.coName = coName;
        this.coNum = coNum;
    }

    public College() {
        super();
    }

    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId == null ? null : coId.trim();
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName == null ? null : coName.trim();
    }

    public Integer getCoNum() {
        return coNum;
    }

    public void setCoNum(Integer coNum) {
        this.coNum = coNum;
    }
}