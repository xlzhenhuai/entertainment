package com.entertainment.dao;

import java.util.List;

import com.entertainment.model.Recharge;

public interface RechargeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recharge record);

    int insertSelective(Recharge record);

    Recharge selectByPrimaryKey(Integer id);
    
    List<Recharge> queryAll(Recharge record); 

    int updateByPrimaryKeySelective(Recharge record);

    int updateByPrimaryKey(Recharge record);
}