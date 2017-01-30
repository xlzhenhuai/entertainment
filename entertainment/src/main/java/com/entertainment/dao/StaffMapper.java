package com.entertainment.dao;

import java.util.List;

import com.entertainment.model.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffId);
    
    List<Staff> queryAll(Staff record);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}