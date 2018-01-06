package com.upc.demosys.model;

import java.util.Date;

public class Punishment {
    private String pId;

    private Date pDate;

    private String pName;

    private String pInstitute;

    private String pReason;

    public Punishment(String pId, Date pDate, String pName, String pInstitute, String pReason) {
        this.pId = pId;
        this.pDate = pDate;
        this.pName = pName;
        this.pInstitute = pInstitute;
        this.pReason = pReason;
    }

    public Punishment() {
        super();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpInstitute() {
        return pInstitute;
    }

    public void setpInstitute(String pInstitute) {
        this.pInstitute = pInstitute == null ? null : pInstitute.trim();
    }

    public String getpReason() {
        return pReason;
    }

    public void setpReason(String pReason) {
        this.pReason = pReason == null ? null : pReason.trim();
    }
}