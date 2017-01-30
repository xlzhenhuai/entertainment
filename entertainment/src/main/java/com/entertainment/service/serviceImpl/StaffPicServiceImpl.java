package com.entertainment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.dao.StaffPicMapper;
import com.entertainment.model.StaffPic;
import com.entertainment.service.IStaffPicService;
@Service
public class StaffPicServiceImpl implements IStaffPicService {
	@Autowired
	StaffPicMapper staffPicMapper;

	@Override
	public boolean save(StaffPic record) {
		// TODO Auto-generated method stub
		try {
			staffPicMapper.insertSelective(record);
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
			staffPicMapper.deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean updata(StaffPic record) {
		// TODO Auto-generated method stub
		try {
			staffPicMapper.updateByPrimaryKeySelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public StaffPic load(Integer id) {
		// TODO Auto-generated method stub
		return staffPicMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<StaffPic> queryAll(StaffPic record) {
		// TODO Auto-generated method stub
		return staffPicMapper.queryAll(record);
	}

	@Override
	public List<StaffPic> queryStaffPicList(StaffPic StaffPic) {
		// TODO Auto-generated method stub
		return null;
	}

}
