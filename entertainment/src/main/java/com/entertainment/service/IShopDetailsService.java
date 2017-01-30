package com.entertainment.service;

import java.util.List;

import com.entertainment.model.ShopDetails;

public interface IShopDetailsService extends IBaesService<ShopDetails> {

		//²éÑ¯µêÆÌÏêÇé
		public abstract List<ShopDetails> queryShopDetails(Integer shopId);


}
