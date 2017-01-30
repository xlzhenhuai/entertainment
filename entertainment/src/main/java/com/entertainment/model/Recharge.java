package com.entertainment.model;

import java.util.Date;
//充值日志
public class Recharge {
	//记录编号
    private Integer id;
    //店铺编号
    private Integer shopId;
    //员工编号
    private Integer staffId;
    //管理员编号
    private Integer administratorsId;
    //充值金额
    private Float recharge;
    //充值时间
    private Date rechargeTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getAdministratorsId() {
        return administratorsId;
    }

    public void setAdministratorsId(Integer administratorsId) {
        this.administratorsId = administratorsId;
    }

    public Float getRecharge() {
        return recharge;
    }

    public void setRecharge(Float recharge) {
        this.recharge = recharge;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }
}