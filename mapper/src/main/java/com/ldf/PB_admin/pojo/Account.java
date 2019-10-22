package com.ldf.PB_admin.pojo;

public class Account {
    private String idCard;

    private String phone;

    private String pwd;

    private String uname;

    public Account(String idCard, String phone, String pwd, String uname) {
        this.idCard = idCard;
        this.phone = phone;
        this.pwd = pwd;
        this.uname = uname;
    }

    public Account() {
        super();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }
}