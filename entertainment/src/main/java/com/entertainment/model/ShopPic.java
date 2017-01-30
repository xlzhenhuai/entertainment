package com.entertainment.model;
//µÍ∆ÃÕº∆¨±Ì
public class ShopPic {
	//Õº∆¨±‡∫≈
    private Integer picId;
    //Õº∆¨µÿ÷∑
    private String picAdd;
    //µÍ∆Ã±‡∫≈
    private Integer shopId;
    // «∑Ò…Û∫À
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