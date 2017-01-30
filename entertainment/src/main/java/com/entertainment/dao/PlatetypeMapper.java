package com.entertainment.dao;

import java.util.List;

import com.entertainment.model.Platetype;

public interface PlatetypeMapper {
    int deleteByPrimaryKey(Integer platetypeId);

    int insert(Platetype record);

    int insertSelective(Platetype record);

    Platetype selectByPrimaryKey(Integer platetypeId);
    
    List<Platetype> queryAll(Platetype record);

    int updateByPrimaryKeySelective(Platetype record);

    int updateByPrimaryKey(Platetype record);
}