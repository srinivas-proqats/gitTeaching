package com.crm.OrangeHRM.framework;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ObjectRepository.java.CommonPage;
import com.ObjectRepository.java.Recruitement;
import com.OrangeHRM.genericUtility.BaseClass;

public class RecruitementD  extends BaseClass{
	
	@Test( groups = { "regression" })
	public void enterRecruitementD() throws AWTException, InterruptedException    {

		CommonPage cp = new CommonPage(driver);
		cp.cickonRecruitment();
		Recruitement rts =new Recruitement(driver); 
		Thread.sleep(5000);
		rts.clickonadd();
		rts.clickonFirstName();
		rts.clickonMiddleName();
		rts.clickonLastName();
		Thread.sleep(5000);
		rts.clickonemail();
		Thread.sleep(3000);
		rts.clickoncontact();
		Thread.sleep(8000);
		//rts.clickonfileupload();
		Thread.sleep(3000);
		rts.clickonkeywords();
		Thread.sleep(3000);
		//rts.clickoncalender();
		Thread.sleep(3000);
		rts.clickontypehere();
		Thread.sleep(3000);
		//rts.clickonkeepdata();
		Thread.sleep(3000);
		rts.clickonsave();
		
		
			
}}