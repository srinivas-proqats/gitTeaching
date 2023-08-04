package com.OrangeHRM.genericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ObjectRepository.java.Loginpage;

public class BaseClass {
	
	protected JavaUtility ju;
	protected WebDriver driver;
	protected DriverUtility du;
	protected PropertyFileUtility pf;
	protected String un;
	protected String pw;
	//protected CommonPage cp; 
	public static WebDriver sdriver;
	
	
	@BeforeClass
	public void opneBrowser() {
		pf=new PropertyFileUtility();
		ju=new JavaUtility();
		
		String browser=pf.getDataFromPropertyFile(KeysPropertyFile.Browser.convertToString(), IConstantpath.PropertyFilePath);
		
		 String url=pf.getDataFromPropertyFile(KeysPropertyFile.Url.convertToString(),IConstantpath.PropertyFilePath);
		 un=pf.getDataFromPropertyFile(KeysPropertyFile.Username.convertToString(), IConstantpath.PropertyFilePath) ;
	 pw=pf.getDataFromPropertyFile(KeysPropertyFile.PassWord.convertToString(),IConstantpath.PropertyFilePath);	
	long timeout=(Long)	 ju.convertToAnyDataType(pf.getDataFromPropertyFile(KeysPropertyFile.TimeOut.convertToString(),IConstantpath.PropertyFilePath ), "long"); 
 
		  du=new DriverUtility();
	ThreadSafe.setdriverUtility(du);
		driver=du.openApplication(browser,timeout,url);
		sdriver=driver;
		
		
		
	}
	@BeforeMethod
	public void logintoAPP() {
		Loginpage lp=new Loginpage(driver);
		lp.loginactions(un, pw);
		 
		
		
		
		
		
	}
	@AfterMethod
	public void logout() {
		
	
	}

		@AfterClass
		public void closeBrowser()
		
		{
			//driver.quit();
		}
	}
	

