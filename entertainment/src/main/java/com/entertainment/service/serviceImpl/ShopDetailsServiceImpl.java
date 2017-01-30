package com.entertainment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.dao.ShopDetailsMapper;
import com.entertainment.model.ShopDetails;
import com.entertainment.service.IShopDetailsService;
@Service
public class ShopDetailsServiceImpl implements IShopDetailsService {
	@Autowired
	ShopDetailsMapper shopDetailsMapper;

	@Override
	public boolean save(ShopDetails record) {
		// TODO Auto-generated method stub
		try {
			shopDetailsMapper.insertSelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public boolean del(Integer id) {
		// TODO Auto-generated method stub
		try {
			shopDetailsMapper.deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean updata(ShopDetails record) {
		// TODO Auto-generated method stub
		try {
			shopDetailsMapper.updateByPrimaryKeySelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public ShopDetails load(Integer id) {
		// TODO Auto-generated method stub
		return shopDetailsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ShopDetails> queryAll(ShopDetails record) {
		// TODO Auto-generated method stub
		return shopDetailsMapper.queryAll(record);
	}

	@Override
	public List<ShopDetails> queryShopDetails(Integer shopId) {
		// TODO Auto-generated method stub
		return null;
	}

}
