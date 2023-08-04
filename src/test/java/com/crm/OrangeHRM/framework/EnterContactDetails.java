package com.crm.OrangeHRM.framework;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ObjectRepository.java.CommonPage;
import com.ObjectRepository.java.MyInfoCD;
import com.OrangeHRM.genericUtility.BaseClass;

public class EnterContactDetails extends BaseClass {

	@Test( groups = {"regression"})
	public void entercd() throws InterruptedException, AWTException   {

		CommonPage cp=new CommonPage(driver);
		cp.clickonMyInfo();
		cp.clickoncontactdetails();
		MyInfoCD cd=new MyInfoCD(driver);
		cd.clickonstreet1();
		cd.clickonstreet2();
		cd.clickoncity(); 
		cd.clickonstate();
		cd.clickonzip();
		cd.clickonhome();
		cd.clickonmobile();
		cd.clickonwork();
		cd.clickonemail();
		cd.clickonotheremail();
		cd.clickonsave();














	}}