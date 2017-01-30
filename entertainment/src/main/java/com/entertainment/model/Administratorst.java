package com.entertainment.model;

import java.util.Date;

public class Administratorst {
    private Integer administratorsId;

    private String accountNumber;

    private String password;

    private String phone;

    private String weixin;

    private String qq;

    private String qrcode;

    private Integer shopId;

    private Boolean examine;

    private Integer gold;

    private Integer jurisdiction;

    private Date rechargeTime;

    public Integer getAdministratorsId() {
        return administratorsId;
    }

    public void setAdministratorsId(Integer administratorsId) {
        this.administratorsId = administratorsId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Boolean getExamine() {
        return examine;
    }

    public void setExamine(Boolean examine) {
        this.examine = examine;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }
}