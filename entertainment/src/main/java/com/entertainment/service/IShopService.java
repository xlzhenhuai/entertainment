package com.entertainment.service;

import java.util.List;

import com.entertainment.model.Shop;

public interface IShopService extends IBaesService<Shop>{

	//��ѯ���е���
	public abstract List<Shop> queryShopList(Shop shop);

	
	
}
