package com.upc.demosys.model;

import java.util.Date;

public class Reword {
    private String rId;

    private Date rYear;

    private String rName;

    private String rInstitute;

    private String rLevel;

    public Reword(String rId, Date rYear, String rName, String rInstitute, String rLevel) {
        this.rId = rId;
        this.rYear = rYear;
        this.rName = rName;
        this.rInstitute = rInstitute;
        this.rLevel = rLevel;
    }

    public Reword() {
        super();
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId == null ? null : rId.trim();
    }

    public Date getrYear() {
        return rYear;
    }

    public void setrYear(Date rYear) {
        this.rYear = rYear;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrInstitute() {
        return rInstitute;
    }

    public void setrInstitute(String rInstitute) {
        this.rInstitute = rInstitute == null ? null : rInstitute.trim();
    }

    public String getrLevel() {
        return rLevel;
    }

    public void setrLevel(String rLevel) {
        this.rLevel = rLevel == null ? null : rLevel.trim();
    }
}