package com.entertainment.service;

import java.util.List;

import com.entertainment.model.Administratorst;

public interface IAdministratorstService extends IBaesService<Administratorst> {

	//��ѯ���й���Ա��Ϣ
	public abstract List<Administratorst> queryAdministratorstList(Administratorst administratorst);


}
