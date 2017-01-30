package com.entertainment.model;

import java.util.Date;

public class Shop {
    private Integer shopId;

    private String shopName;

    private String homepage;

    private String province;

    private String city;

    private String district;

    private String tradingArea;

    private Boolean recommend;

    private Boolean examine;

    private Boolean exhibition;

    private Date uploadtime;

    private Date duetime;

    private Integer clickvolume;

    private Integer platetypeId;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTradingArea() {
        return tradingArea;
    }

    public void setTradingArea(String tradingArea) {
        this.tradingArea = tradingArea;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Boolean getExamine() {
        return examine;
    }

    public void setExamine(Boolean examine) {
        this.examine = examine;
    }

    public Boolean getExhibition() {
        return exhibition;
    }

    public void setExhibition(Boolean exhibition) {
        this.exhibition = exhibition;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Date getDuetime() {
        return duetime;
    }

    public void setDuetime(Date duetime) {
        this.duetime = duetime;
    }

    public Integer getClickvolume() {
        return clickvolume;
    }

    public void setClickvolume(Integer clickvolume) {
        this.clickvolume = clickvolume;
    }

    public Integer getPlatetypeId() {
        return platetypeId;
    }

    public void setPlatetypeId(Integer platetypeId) {
        this.platetypeId = platetypeId;
    }
}