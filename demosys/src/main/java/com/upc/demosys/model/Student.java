package com.upc.demosys.model;

import java.util.Date;

public class Student {
    private String sid;

    private Integer clId;

    private String coId;

    private String mId;

    private String password;

    private String name;

    private String sex;

    private String classname;

    private Date birthdate;

    private String birthplace;

    private String minzu;

    private String postcode;

    private String homeaddr;

    private Date intime;

    private String id;

    private Integer lenofsc;

    private String major;

    private String college;

    public Student(String sid, Integer clId, String coId, String mId, String password, String name, String sex, String classname, Date birthdate, String birthplace, String minzu, String postcode, String homeaddr, Date intime, String id, Integer lenofsc, String major, String college) {
        this.sid = sid;
        this.clId = clId;
        this.coId = coId;
        this.mId = mId;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.classname = classname;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
        this.minzu = minzu;
        this.postcode = postcode;
        this.homeaddr = homeaddr;
        this.intime = intime;
        this.id = id;
        this.lenofsc = lenofsc;
        this.major = major;
        this.college = college;
    }

    public Student() {
        super();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId == null ? null : coId.trim();
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu == null ? null : minzu.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getHomeaddr() {
        return homeaddr;
    }

    public void setHomeaddr(String homeaddr) {
        this.homeaddr = homeaddr == null ? null : homeaddr.trim();
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getLenofsc() {
        return lenofsc;
    }

    public void setLenofsc(Integer lenofsc) {
        this.lenofsc = lenofsc;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }
}