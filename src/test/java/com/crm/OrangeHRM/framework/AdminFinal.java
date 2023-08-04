package com.crm.OrangeHRM.framework;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ObjectRepository.java.Admin;
import com.ObjectRepository.java.CommonPage;
import com.OrangeHRM.genericUtility.BaseClass;

public class AdminFinal extends BaseClass {
	
	
	@Test( groups = {"regression"})
	public void entercd() throws InterruptedException, AWTException   {

		CommonPage cp=new CommonPage(driver);
		cp.clickonAdminpanel();

		Admin ad=new Admin(driver);
		ad.clickonconfiguration();
		ad.clickonemailconfigaration();
		Thread.sleep(5000);
		ad.clickonemail();
		Thread.sleep(5000);
		ad.clickonsmtp();
		ad.clikonsmtphost();
		ad.clickonsmtpport();
		ad.clickcheckyes();
		ad.clickontoggle1();
		ad.clickontoggle2();
}}
