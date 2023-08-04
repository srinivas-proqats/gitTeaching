package com.crm.OrangeHRM.framework;

import org.testng.annotations.Test;

import com.ObjectRepository.java.CommonPage;
import com.ObjectRepository.java.MyInfoEC;
import com.OrangeHRM.genericUtility.BaseClass;

public class EnterEmergencyContacts extends BaseClass  {
	
	@Test( groups = {"smoke"})
		public void enterEC() throws InterruptedException  {

			CommonPage cp = new CommonPage(driver);
			cp.clickonMyInfo();
			
			MyInfoEC ec=new MyInfoEC(driver);
			ec.clickonemergenceycontacts();
			
			
			ec.clickonadd();
			Thread.sleep(4000);
			ec.clickonname();
			Thread.sleep(4000);
			ec.clickonrelationship();
			Thread.sleep(4000);
			ec.clickonhometelephone();
			Thread.sleep(4000);
			ec.clickonmobile();
			Thread.sleep(4000);
			ec.clickonWorktelephone();
			Thread.sleep(4000);
			ec.clickonsave();
			
			
			
			
}}
