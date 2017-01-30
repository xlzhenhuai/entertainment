package com.entertainment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.dao.StaffMapper;
import com.entertainment.model.Staff;
import com.entertainment.service.IStaffService;
@Service
public class StaffServiceImpl implements IStaffService {
	@Autowired
	StaffMapper staffMapper;
	@Override
	public boolean save(Staff record) {
		// TODO Auto-generated method stub
		try {
			staffMapper.insertSelective(record);
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
			staffMapper.deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean updata(Staff record) {
		// TODO Auto-generated method stub
		try {
			staffMapper.updateByPrimaryKeySelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Staff load(Integer id) {
		// TODO Auto-generated method stub
		return staffMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Staff> queryAll(Staff record) {
		// TODO Auto-generated method stub
		return staffMapper.queryAll(record);
	}

	@Override
	public List<Staff> queryStaffList(Staff staff) {
		// TODO Auto-generated method stub
		return null;
	}

}
