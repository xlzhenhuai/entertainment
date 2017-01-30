package com.entertainment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.dao.ShopPicMapper;
import com.entertainment.model.ShopPic;
import com.entertainment.service.IShopPicService;
@Service
public class ShopPicServiceImpl implements IShopPicService {
	@Autowired
	ShopPicMapper shopPicMapper;

	@Override
	public boolean save(ShopPic record) {
		// TODO Auto-generated method stub
		try {
			shopPicMapper.insertSelective(record);
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
			shopPicMapper.deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean updata(ShopPic record) {
		// TODO Auto-generated method stub
		try {
			shopPicMapper.updateByPrimaryKeySelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public ShopPic load(Integer id) {
		// TODO Auto-generated method stub
		return shopPicMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ShopPic> queryAll(ShopPic record) {
		// TODO Auto-generated method stub
		return shopPicMapper.queryAll(record);
	}

	@Override
	public List<ShopPic> queryShopPicList(ShopPic shopPic) {
		// TODO Auto-generated method stub
		return null;
	}

}
