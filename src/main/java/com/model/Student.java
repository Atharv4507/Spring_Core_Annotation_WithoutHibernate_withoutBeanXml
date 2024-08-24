package com.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int sid;
    private String sname;
    private String scity;
    private double spercentage;
    public void setSid(int sid) {
        this.sid = sid;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage + "]"+"\n";
    }
    public int getSid() {
        return sid;
    }
    public String getSname() {
        return sname;
    }
    public String getScity() {
        return scity;
    }
    public double getSpercentage() {
        return spercentage;
    }
    public void setScity(String scity) {
        this.scity = scity;
    }
    public void setSpercentage(double spercentage) {
        this.spercentage = spercentage;
    }
}
