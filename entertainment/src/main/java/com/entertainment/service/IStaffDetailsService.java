package com.entertainment.service;

import java.util.List;

import com.entertainment.model.StaffDetails;

public interface IStaffDetailsService extends IBaesService<StaffDetails> {

	//查询员工详细信息
	public abstract List<StaffDetails> queryStaffDetails(Integer shopId);

}
