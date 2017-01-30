package com.entertainment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.dao.PlatetypeMapper;
import com.entertainment.model.Platetype;
import com.entertainment.service.IPlatetypeService;
@Service
public class PlatetypeServiceImpl implements IPlatetypeService {
	@Autowired
	PlatetypeMapper platetypeMapper;

	@Override
	public boolean save(Platetype record) {
		// TODO Auto-generated method stub
		try {
			platetypeMapper.insertSelective(record);
			return false;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public boolean del(Integer id) {
		// TODO Auto-generated method stub
		try {
			platetypeMapper.deleteByPrimaryKey(id);
			return false;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean updata(Platetype record) {
		// TODO Auto-generated method stub
		try {
			platetypeMapper.updateByPrimaryKeySelective(record);
			return false;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Platetype load(Integer id) {
		// TODO Auto-generated method stub
		return platetypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Platetype> queryAll(Platetype record) {
		// TODO Auto-generated method stub
		return platetypeMapper.queryAll(record);
	}

	@Override
	public List<Platetype> queryPlatetypeList(Platetype platetype) {
		// TODO Auto-generated method stub
		return null;
	}

}
