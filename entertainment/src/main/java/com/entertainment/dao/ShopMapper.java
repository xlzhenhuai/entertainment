package com.entertainment.dao;

import java.util.List;

import com.entertainment.model.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer shopId);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer shopId);
    
    List<Shop> queryAll(Shop record);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}