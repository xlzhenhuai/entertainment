package com.entertainment.service;

import java.util.List;

import com.entertainment.model.StaffDetails;

public interface IStaffDetailsService extends IBaesService<StaffDetails> {

	//��ѯԱ����ϸ��Ϣ
	public abstract List<StaffDetails> queryStaffDetails(Integer shopId);

}
