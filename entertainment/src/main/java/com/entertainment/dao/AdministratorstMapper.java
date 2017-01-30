package com.entertainment.dao;

import java.util.List;

import com.entertainment.model.Administratorst;

public interface AdministratorstMapper {
    int deleteByPrimaryKey(Integer administratorsId);

    int insert(Administratorst record);

    int insertSelective(Administratorst record);

    Administratorst selectByPrimaryKey(Integer administratorsId);
    
    List<Administratorst> queryAll(Administratorst record);

    int updateByPrimaryKeySelective(Administratorst record);

    int updateByPrimaryKey(Administratorst record);
}