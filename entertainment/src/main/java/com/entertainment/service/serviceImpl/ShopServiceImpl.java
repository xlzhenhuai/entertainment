package com.entertainment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.dao.ShopMapper;
import com.entertainment.model.Shop;
import com.entertainment.service.IShopService;
@Service
public class ShopServiceImpl implements IShopService {

	@Autowired
	ShopMapper shopMapper;

	@Override
	public boolean save(Shop record) {
		// TODO Auto-generated method stub
		try {
			shopMapper.insertSelective(record);
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
			shopMapper.deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean updata(Shop record) {
		// TODO Auto-generated method stub
		try {
			shopMapper.updateByPrimaryKeySelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Shop load(Integer id) {
		// TODO Auto-generated method stub
		
		return shopMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Shop> queryShopList(Shop shop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shop> queryAll(Shop record) {
		// TODO Auto-generated method stub
		return shopMapper.queryAll(record);
	}






























}
