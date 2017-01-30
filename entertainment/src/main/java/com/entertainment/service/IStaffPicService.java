package com.entertainment.service;

import java.util.List;

import com.entertainment.model.StaffPic;

public interface IStaffPicService extends IBaesService<StaffPic> {

	//查询所有店铺图片信息
	public abstract List<StaffPic> queryStaffPicList(StaffPic StaffPic);

}
