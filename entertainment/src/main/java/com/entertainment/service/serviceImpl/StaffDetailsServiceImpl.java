package com.entertainment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.dao.StaffDetailsMapper;
import com.entertainment.model.StaffDetails;
import com.entertainment.service.IStaffDetailsService;
@Service
public class StaffDetailsServiceImpl implements IStaffDetailsService {
	@Autowired
	StaffDetailsMapper staffDetailsMapper;

	@Override
	public boolean save(StaffDetails record) {
		// TODO Auto-generated method stub
		try {
			staffDetailsMapper.insertSelective(record);
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
			staffDetailsMapper.deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean updata(StaffDetails record) {
		// TODO Auto-generated method stub
		try {
			staffDetailsMapper.updateByPrimaryKeySelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public StaffDetails load(Integer id) {
		// TODO Auto-generated method stub
		return staffDetailsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<StaffDetails> queryAll(StaffDetails record) {
		// TODO Auto-generated method stub
		return staffDetailsMapper.queryAll(record);
	}

	@Override
	public List<StaffDetails> queryStaffDetails(Integer shopId) {
		// TODO Auto-generated method stub
		return null;
	}

}
