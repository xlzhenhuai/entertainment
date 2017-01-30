package com.entertainment.model;

import java.util.Date;

public class Staff {
    private Integer staffId;

    private String staffName;

    private String homepphotos;

    private Boolean sex;

    private Integer age;

    private String city;

    private Boolean recommend;

    private Integer shopId;

    private Integer administratorsId;

    private Boolean examine;

    private Boolean exhibition;

    private Date uploadtime;

    private Date duetime;

    private Integer platetypeId;

    private Integer clickvolume;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getHomepphotos() {
        return homepphotos;
    }

    public void setHomepphotos(String homepphotos) {
        this.homepphotos = homepphotos;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getAdministratorsId() {
        return administratorsId;
    }

    public void setAdministratorsId(Integer administratorsId) {
        this.administratorsId = administratorsId;
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

    public Integer getPlatetypeId() {
        return platetypeId;
    }

    public void setPlatetypeId(Integer platetypeId) {
        this.platetypeId = platetypeId;
    }

    public Integer getClickvolume() {
        return clickvolume;
    }

    public void setClickvolume(Integer clickvolume) {
        this.clickvolume = clickvolume;
    }
}