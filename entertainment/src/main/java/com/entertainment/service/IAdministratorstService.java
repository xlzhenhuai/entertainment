package com.entertainment.service;

import java.util.List;

import com.entertainment.model.Administratorst;

public interface IAdministratorstService extends IBaesService<Administratorst> {

	//查询所有管理员信息
	public abstract List<Administratorst> queryAdministratorstList(Administratorst administratorst);


}
