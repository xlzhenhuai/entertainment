package com.entertainment.service;

import java.util.List;

import com.entertainment.model.Staff;

public interface IStaffService extends IBaesService<Staff>{

	//��ѯ����Ա����Ϣ
	public abstract List<Staff> queryStaffList(Staff staff);		

}
