package com.entertainment.service;

import java.util.List;

import com.entertainment.model.ShopPic;

public interface IShopPicService extends IBaesService<ShopPic> {

	//��ѯ����Ա��ͼƬ��Ϣ
	public abstract List<ShopPic> queryShopPicList(ShopPic shopPic);


}
