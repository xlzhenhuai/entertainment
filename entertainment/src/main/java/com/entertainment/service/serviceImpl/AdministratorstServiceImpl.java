package com.entertainment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.dao.AdministratorstMapper;
import com.entertainment.model.Administratorst;
import com.entertainment.service.IAdministratorstService;
@Service
public class AdministratorstServiceImpl implements IAdministratorstService {
	@Autowired
	AdministratorstMapper administratorstMapper;

	@Override
	public boolean save(Administratorst record) {
		// TODO Auto-generated method stub
		try {
			administratorstMapper.insertSelective(record);
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
			administratorstMapper.deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean updata(Administratorst record) {
		// TODO Auto-generated method stub
		try {
			administratorstMapper.updateByPrimaryKeySelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Administratorst load(Integer id) {
		// TODO Auto-generated method stub
		return administratorstMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Administratorst> queryAll(Administratorst record) {
		// TODO Auto-generated method stub
		return administratorstMapper.queryAll(record);
	}

	@Override
	public List<Administratorst> queryAdministratorstList(
			Administratorst administratorst) {
		// TODO Auto-generated method stub
		return null;
	}

}
