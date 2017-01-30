package com.entertainment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.dao.RechargeMapper;
import com.entertainment.model.Recharge;
import com.entertainment.service.IRechargeService;
@Service
public class RechargeServiceImpl implements IRechargeService {
	@Autowired
	RechargeMapper rechargeMapper;

	@Override
	public boolean save(Recharge record) {
		// TODO Auto-generated method stub
		try {
			rechargeMapper.insertSelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public boolean del(Integer id) {
		// TODO Auto-generated method stub
		try {
			rechargeMapper.deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean updata(Recharge record) {
		// TODO Auto-generated method stub
		try {
			rechargeMapper.updateByPrimaryKeySelective(record);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Recharge load(Integer id) {
		// TODO Auto-generated method stub
		return rechargeMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Recharge> queryAll(Recharge record) {
		// TODO Auto-generated method stub
		return rechargeMapper.queryAll(record);
	}

	@Override
	public List<Recharge> queryRechargeList(Recharge recharge) {
		// TODO Auto-generated method stub
		return null;
	}

}
