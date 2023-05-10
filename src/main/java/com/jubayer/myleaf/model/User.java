package com.jubayer.myleaf.model;

public class User {
    private String ename;
    private String date;

    private  String category;
    private  String des;
    private  String amount;

    public User() {
    }

    public User(String ename, String date, String category, String des, String amount) {
        this.ename = ename;
        this.date = date;
        this.category = category;
        this.des = des;
        this.amount = amount;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
