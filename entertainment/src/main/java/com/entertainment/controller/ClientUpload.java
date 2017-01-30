package com.entertainment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

public class ClientUpload {
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
			 * 注册管理员
			 */
			@RequestMapping(value = "/regisAdministratorst")
			public void regisAdministratorst(Administratorst administratorst){
				iAdministratorstService.save(administratorst);
			}
			
			/**
			 * 添加店铺数据	
			 */
			@RequestMapping(value = "/addShop")
			public void addShop(Shop shop){
				iShopService.save(shop);
			}
			
			/**
			 * 修改店铺数据	
			 */
			@RequestMapping(value = "/updataShop")
			public void updataShop(Shop shop){
				iShopService.updata(shop);
			}
			
			
			/**
			 * 添加店铺详情数据	
			 */
			@RequestMapping(value = "/addShopDetails")
			public void addShopDetails(ShopDetails shopDetails){
				iShopDetailsService.save(shopDetails);
			}
			
			/**
			 * 修改店铺详情数据	
			 */
			@RequestMapping(value = "/updataShopDetails")
			public void updataShopDetails(ShopDetails shopDetails){
				iShopDetailsService.updata(shopDetails);
			}
			

			
			/**
			 * 添加店铺图片	
			 */
			@RequestMapping(value = "/addShopDetails")
			public void addShopPic(ShopPic shopPic){
				iShopPicService.save(shopPic);
			}
			
			/**
			 * 修改店铺图片	
			 */
			@RequestMapping(value = "/updataShopDetails")
			public void updataShopPic(ShopPic shopPic){
				iShopPicService.updata(shopPic);
			}
			
			/**
			 * 添加员工数据
			 */
			@RequestMapping(value = "/addStaff")
			public void addStaff(Staff staff){
				iStaffService.save(staff);  
			}
			
			/**
			 * 修改员工数据
			 */
			@RequestMapping(value = "/updataStaff")
			public void updataStaff(Staff staff){
				iStaffService.updata(staff);  
			}
			
			/**
			 * 添加员工详情数据
			 */
			@RequestMapping(value = "/addStaffDetails")
			public void addStaffDetails(StaffDetails staffDetails){
				iStaffDetailsService.save(staffDetails);
			}
			
			/**
			 * 修改员工详情数据
			 */
			@RequestMapping(value = "/updataStaffDetails")
			public void updataStaffDetails(StaffDetails staffDetails){
				iStaffDetailsService.updata(staffDetails);
			}
			
			/**
			 * 添加员工图片
			 */
			@RequestMapping(value = "/addStaff")
			public void addStaffPic(StaffPic staffPic){
				iStaffPicService.save(staffPic);  
			}
			
			/**
			 * 修改员工图片
			 */
			@RequestMapping(value = "/updataStaff")
			public void updataStaffPic(StaffPic staffPic){
				iStaffPicService.updata(staffPic);  
			}
}
