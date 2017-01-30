package com.entertainment.dao;

import java.util.List;

import com.entertainment.model.StaffDetails;

public interface StaffDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StaffDetails record);

    int insertSelective(StaffDetails record);

    StaffDetails selectByPrimaryKey(Integer id);
    
    List<StaffDetails> queryAll(StaffDetails record);

    int updateByPrimaryKeySelective(StaffDetails record);

    int updateByPrimaryKeyWithBLOBs(StaffDetails record);

    int updateByPrimaryKey(StaffDetails record);
}