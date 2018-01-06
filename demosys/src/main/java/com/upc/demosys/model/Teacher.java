package com.upc.demosys.model;

public class Teacher {
    private String tId;

    private String mId;

    private String coId;

    private String tName;

    private String tPassword;

    public Teacher(String tId, String mId, String coId, String tName, String tPassword) {
        this.tId = tId;
        this.mId = mId;
        this.coId = coId;
        this.tName = tName;
        this.tPassword = tPassword;
    }

    public Teacher() {
        super();
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
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

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword == null ? null : tPassword.trim();
    }
}