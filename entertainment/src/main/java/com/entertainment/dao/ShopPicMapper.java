package com.entertainment.dao;

import java.util.List;

import com.entertainment.model.ShopPic;

public interface ShopPicMapper {
    int deleteByPrimaryKey(Integer picId);

    int insert(ShopPic record);

    int insertSelective(ShopPic record);

    ShopPic selectByPrimaryKey(Integer picId);
    
    List<ShopPic> queryAll(ShopPic record);

    int updateByPrimaryKeySelective(ShopPic record);

    int updateByPrimaryKey(ShopPic record);
}