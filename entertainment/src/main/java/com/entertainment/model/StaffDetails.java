package com.entertainment.model;

import java.util.Date;

public class StaffDetails {
    private Integer id;

    private Integer staffId;

    private Integer staffNb;

    private Date birthday;

    private Integer height;

    private Integer weight;

    private Integer bust;

    private Integer waist;

    private Integer hipline;

    private String introduce;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getStaffNb() {
        return staffNb;
    }

    public void setStaffNb(Integer staffNb) {
        this.staffNb = staffNb;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBust() {
        return bust;
    }

    public void setBust(Integer bust) {
        this.bust = bust;
    }

    public Integer getWaist() {
        return waist;
    }

    public void setWaist(Integer waist) {
        this.waist = waist;
    }

    public Integer getHipline() {
        return hipline;
    }

    public void setHipline(Integer hipline) {
        this.hipline = hipline;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}