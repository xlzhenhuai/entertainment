package com.entertainment.service;

import java.util.List;

import com.entertainment.model.Platetype;

public interface IPlatetypeService extends IBaesService<Platetype> {

	//��ѯ���а����Ϣ
	public abstract List<Platetype> queryPlatetypeList(Platetype platetype);


}
