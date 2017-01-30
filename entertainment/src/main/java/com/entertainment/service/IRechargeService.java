package com.entertainment.service;

import java.util.List;

import com.entertainment.model.Recharge;


public interface IRechargeService extends IBaesService<Recharge> {

	//查询所有充值日志信息
	public abstract List<Recharge> queryRechargeList(Recharge recharge);

}
