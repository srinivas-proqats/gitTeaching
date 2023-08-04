package com.crm.OrangeHRM.framework;

import org.testng.annotations.Test;

import com.ObjectRepository.java.CommonPage;
import com.ObjectRepository.java.MaintenenceD;
import com.OrangeHRM.genericUtility.BaseClass;

public class Maintenence extends BaseClass {
	
	@Test( groups = {"regression"})
	public void maintenence() throws InterruptedException   {

		CommonPage cp=new CommonPage(driver);
	cp.clickonMaintenence();
	
	MaintenenceD md=new MaintenenceD(driver);
	md.clickonchangepw();
	md.clickonconfirm();
	md.clickonhints();
		
	}}