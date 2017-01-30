package com.entertainment.dao;

import java.util.List;

import com.entertainment.model.ShopDetails;

public interface ShopDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopDetails record);

    int insertSelective(ShopDetails record);

    ShopDetails selectByPrimaryKey(Integer id);
    
    List<ShopDetails> queryAll(ShopDetails record);

    int updateByPrimaryKeySelective(ShopDetails record);

    int updateByPrimaryKeyWithBLOBs(ShopDetails record);

    int updateByPrimaryKey(ShopDetails record);
}