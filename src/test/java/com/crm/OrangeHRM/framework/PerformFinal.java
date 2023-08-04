package com.crm.OrangeHRM.framework;

import org.testng.annotations.Test;

import com.ObjectRepository.java.CommonPage;
import com.ObjectRepository.java.Performance2;
import com.OrangeHRM.genericUtility.BaseClass;

public class PerformFinal extends BaseClass {
	
	@Test( groups = { "regression" })
	public void enterpfm2() throws Throwable    {

		CommonPage cp=new CommonPage(driver);
		cp.clickonPerformance();
		Performance2 pfm=new Performance2(driver);
		pfm.clickonconfigure();
		pfm.clickontrackers();
		pfm.clickadd();
		pfm.clickontrackername();
		pfm.clickoempname();
		pfm.clickonreview();
		pfm.clickonsave();
	
		

}
}