package com.entertainment.model;

import java.util.Date;
//��ֵ��־
public class Recharge {
	//��¼���
    private Integer id;
    //���̱��
    private Integer shopId;
    //Ա�����
    private Integer staffId;
    //����Ա���
    private Integer administratorsId;
    //��ֵ���
    private Float recharge;
    //��ֵʱ��
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