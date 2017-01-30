package com.entertainment.dao;

import java.util.List;

import com.entertainment.model.StaffPic;

public interface StaffPicMapper {
    int deleteByPrimaryKey(Integer picId);

    int insert(StaffPic record);

    int insertSelective(StaffPic record);

    StaffPic selectByPrimaryKey(Integer picId);
    
    List<StaffPic> queryAll(StaffPic record);

    int updateByPrimaryKeySelective(StaffPic record);

    int updateByPrimaryKey(StaffPic record);
}