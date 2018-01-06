package com.upc.demosys.model;

public class Admin {
    private String aname;

    private String apassword;

    public Admin(String aname, String apassword) {
        this.aname = aname;
        this.apassword = apassword;
    }

    public Admin() {
        super();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword == null ? null : apassword.trim();
    }
}