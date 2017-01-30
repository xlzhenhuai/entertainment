package com.entertainment.service;

import java.util.List;

import com.entertainment.model.ShopPic;

public interface IShopPicService extends IBaesService<ShopPic> {

	//查询所有员工图片信息
	public abstract List<ShopPic> queryShopPicList(ShopPic shopPic);


}
