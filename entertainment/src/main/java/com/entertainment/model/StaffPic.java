package com.entertainment.model;
//Ա��ͼƬ��
public class StaffPic {
	//ͼƬ���
    private Integer picId;
    //ͼƬ��ַ
    private String picAdd;
    //Ա�����
    private Integer staffId;
    //�Ƿ����
    private Boolean examine;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPicAdd() {
        return picAdd;
    }

    public void setPicAdd(String picAdd) {
        this.picAdd = picAdd;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Boolean getExamine() {
        return examine;
    }

    public void setExamine(Boolean examine) {
        this.examine = examine;
    }
}