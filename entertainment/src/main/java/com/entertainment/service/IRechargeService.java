package com.entertainment.service;

import java.util.List;

import com.entertainment.model.Recharge;


public interface IRechargeService extends IBaesService<Recharge> {

	//��ѯ���г�ֵ��־��Ϣ
	public abstract List<Recharge> queryRechargeList(Recharge recharge);

}
