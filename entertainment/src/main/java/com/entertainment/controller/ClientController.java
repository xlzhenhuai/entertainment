package com.entertainment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entertainment.model.Administratorst;
import com.entertainment.model.Shop;
import com.entertainment.model.ShopDetails;
import com.entertainment.model.ShopPic;
import com.entertainment.model.Staff;
import com.entertainment.model.StaffDetails;
import com.entertainment.model.StaffPic;
import com.entertainment.service.IAdministratorstService;
import com.entertainment.service.IShopDetailsService;
import com.entertainment.service.IShopPicService;
import com.entertainment.service.IShopService;
import com.entertainment.service.IStaffDetailsService;
import com.entertainment.service.IStaffPicService;
import com.entertainment.service.IStaffService;

@Controller
@RequestMapping("client")
public class ClientController {
	@Autowired
	IShopService iShopService;
	@Autowired
	IShopDetailsService iShopDetailsService;
	@Autowired
	IShopPicService iShopPicService;
	@Autowired
	IStaffService iStaffService;
	@Autowired
	IStaffDetailsService iStaffDetailsService;
	@Autowired
	IStaffPicService iStaffPicService;
	@Autowired
	IAdministratorstService iAdministratorstService;
	
		/**
		 * 查询所有店铺
		 * @return
		 */
		@RequestMapping(value = "/shopAll")
		public List<Shop> shopAll(Shop shop){
			return iShopService.queryAll(shop);
			};
		/**
		 * 查询店铺详情
		 * @return
		 */
		
		@RequestMapping(value = "/shopDetails")
		public ShopDetails shopDetails(Integer id ){
			return iShopDetailsService.load(id);}
		
		/**
		 * 查询所有员工
		 * @return
		 */
		@RequestMapping(value = "/staffAll")
		public List<Staff> staffAll(Staff staff){
			return iStaffService.queryAll(staff);};
		
		/**
		 * 查询员工详情
		 * @return
		 */
		@RequestMapping(value = "/staffDetails")
		public StaffDetails staffDetails(Integer id ){
			return iStaffDetailsService.load(id);}	
		




		
		

		
		
	
	

}
