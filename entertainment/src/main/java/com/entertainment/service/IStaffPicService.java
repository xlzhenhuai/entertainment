package com.entertainment.service;

import java.util.List;

import com.entertainment.model.StaffPic;

public interface IStaffPicService extends IBaesService<StaffPic> {

	//��ѯ���е���ͼƬ��Ϣ
	public abstract List<StaffPic> queryStaffPicList(StaffPic StaffPic);

}
