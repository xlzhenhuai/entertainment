package com.entertainment.service;

import java.util.List;

import com.entertainment.model.Staff;

public interface IStaffService extends IBaesService<Staff>{

	//查询所有员工信息
	public abstract List<Staff> queryStaffList(Staff staff);		

}
