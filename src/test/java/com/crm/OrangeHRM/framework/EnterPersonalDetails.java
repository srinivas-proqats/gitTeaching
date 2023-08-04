package com.crm.OrangeHRM.framework;

import com.ObjectRepository.java.CommonPage;
import com.ObjectRepository.java.MyInfoPD;
import com.OrangeHRM.genericUtility.BaseClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;


public class EnterPersonalDetails extends BaseClass {
	
	@Test( groups = {"regression"})
	public void enterpd() throws InterruptedException, AWTException, IOException {

		CommonPage cp = new CommonPage(driver);
		Thread.sleep(4000);
		cp.clickonMyInfo();
		
		MyInfoPD mi = new MyInfoPD(driver);
		
		
		
		mi.clickonfirstname();
		mi.clickonmiddlename();
		mi.clickonlastname();
		mi.clickonnickname();
		mi.clickonemployeeID();
		mi.clickonotheID();
		mi.clickondriverslicence();
		Thread.sleep(4000);
		mi.clickonlicenceexpirydate();
		mi.clickonssnnumber();
		mi.clickonsinnumber();
		 mi.clickondob();
		// mi.clickonmale();
		mi.clickonmilitaryservice();
		 mi.clickonsmoker();
		mi.clickonsave();
	
	
	
		
		
	}

}
