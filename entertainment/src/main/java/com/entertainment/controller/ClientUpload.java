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
			 * ע�����Ա
			 */
			@RequestMapping(value = "/regisAdministratorst")
			public void regisAdministratorst(Administratorst administratorst){
				iAdministratorstService.save(administratorst);
			}
			
			/**
			 * ��ӵ�������	
			 */
			@RequestMapping(value = "/addShop")
			public void addShop(Shop shop){
				iShopService.save(shop);
			}
			
			/**
			 * �޸ĵ�������	
			 */
			@RequestMapping(value = "/updataShop")
			public void updataShop(Shop shop){
				iShopService.updata(shop);
			}
			
			
			/**
			 * ��ӵ�����������	
			 */
			@RequestMapping(value = "/addShopDetails")
			public void addShopDetails(ShopDetails shopDetails){
				iShopDetailsService.save(shopDetails);
			}
			
			/**
			 * �޸ĵ�����������	
			 */
			@RequestMapping(value = "/updataShopDetails")
			public void updataShopDetails(ShopDetails shopDetails){
				iShopDetailsService.updata(shopDetails);
			}
			

			
			/**
			 * ��ӵ���ͼƬ	
			 */
			@RequestMapping(value = "/addShopDetails")
			public void addShopPic(ShopPic shopPic){
				iShopPicService.save(shopPic);
			}
			
			/**
			 * �޸ĵ���ͼƬ	
			 */
			@RequestMapping(value = "/updataShopDetails")
			public void updataShopPic(ShopPic shopPic){
				iShopPicService.updata(shopPic);
			}
			
			/**
			 * ���Ա������
			 */
			@RequestMapping(value = "/addStaff")
			public void addStaff(Staff staff){
				iStaffService.save(staff);  
			}
			
			/**
			 * �޸�Ա������
			 */
			@RequestMapping(value = "/updataStaff")
			public void updataStaff(Staff staff){
				iStaffService.updata(staff);  
			}
			
			/**
			 * ���Ա����������
			 */
			@RequestMapping(value = "/addStaffDetails")
			public void addStaffDetails(StaffDetails staffDetails){
				iStaffDetailsService.save(staffDetails);
			}
			
			/**
			 * �޸�Ա����������
			 */
			@RequestMapping(value = "/updataStaffDetails")
			public void updataStaffDetails(StaffDetails staffDetails){
				iStaffDetailsService.updata(staffDetails);
			}
			
			/**
			 * ���Ա��ͼƬ
			 */
			@RequestMapping(value = "/addStaff")
			public void addStaffPic(StaffPic staffPic){
				iStaffPicService.save(staffPic);  
			}
			
			/**
			 * �޸�Ա��ͼƬ
			 */
			@RequestMapping(value = "/updataStaff")
			public void updataStaffPic(StaffPic staffPic){
				iStaffPicService.updata(staffPic);  
			}
}
