package com.entertainment.model;
//����ͼƬ��
public class ShopPic {
	//ͼƬ���
    private Integer picId;
    //ͼƬ��ַ
    private String picAdd;
    //���̱��
    private Integer shopId;
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
}