package com.crm.OrangeHRM.framework;

import org.testng.annotations.Test;

import com.ObjectRepository.java.Buzz;
import com.ObjectRepository.java.CommonPage;
import com.OrangeHRM.genericUtility.BaseClass;

public class BuzzFinal extends BaseClass {
	
	

	@Test( groups = {"smoke"})
	public void enterpd() throws InterruptedException  {

		CommonPage cp = new CommonPage(driver);
		
		cp.clickonBuzz();
		
		Buzz bz=new Buzz(driver);
		bz.clickonmind();
		bz.clickonpost();
}}
