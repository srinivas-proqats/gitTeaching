package com.crm.OrangeHRM.framework;

import org.testng.annotations.Test;

import com.ObjectRepository.java.CommonPage;
import com.ObjectRepository.java.Performance;
import com.OrangeHRM.genericUtility.BaseClass;

public class PerformanceFinal extends BaseClass {
	
	
	@Test( groups = { "regression" })
	public void enterpd() throws InterruptedException  {

		CommonPage cp = new CommonPage(driver);
		cp.clickonPerformance();
		
		Performance pf=new Performance(driver);
		pf.clickonmanagereviews();
		pf.clickonmyreviews();
		pf.clickonAddbutton();
		
		pf.clickonrating();
		Thread.sleep(5000);
		pf.clickoncomments();

		pf.clickonrating2();
		pf.clickoncomment2();
		pf.clickonrating3();
		pf.clickoncomment3();
		pf.clickonrating4();
		pf.clickoncomment4();

		//pf.clickonrating5();
		pf.clickoncomment5();
		Thread.sleep(6000);
		pf.clickongeneralcomment();
		pf.clickoncomplete();

}}
