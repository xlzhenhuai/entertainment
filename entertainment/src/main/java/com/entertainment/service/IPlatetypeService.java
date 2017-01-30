package com.entertainment.service;

import java.util.List;

import com.entertainment.model.Platetype;

public interface IPlatetypeService extends IBaesService<Platetype> {

	//查询所有板块信息
	public abstract List<Platetype> queryPlatetypeList(Platetype platetype);


}
