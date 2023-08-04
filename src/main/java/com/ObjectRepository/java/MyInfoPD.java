package com.ObjectRepository.java;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.DriverUtility;
import com.OrangeHRM.genericUtility.ExcelUtility;
import com.OrangeHRM.genericUtility.IConstantpath;

public class MyInfoPD {     
	DriverUtility du=new DriverUtility();
	
	
@FindBy(xpath="//input[@placeholder='First Name']") private WebElement firstname;
@FindBy(xpath="//input[@name='middleName']") private WebElement middilename;
@FindBy(xpath="//input[@name='lastName']") private WebElement lastname;
@FindBy(xpath="(//input)[5]")private WebElement nickname;
@FindBy(xpath="(//input)[@class='oxd-input oxd-input--active'][3]") private WebElement employeeID;
@FindBy(xpath="(//input)[7]") private WebElement otheID;
@FindBy(xpath="(//input)[8]") private WebElement driverslicence;

@FindBy(xpath="(//input)[9]") private WebElement licenceexpirydate;
@FindBy(xpath="(//input)[10]") private WebElement ssnnumber;
@FindBy(xpath="(//input)[11]") private WebElement sinnumber;
@FindBy(xpath="(//input)[12]") private WebElement dob;
@FindBy(xpath="//input[@value='1']")private WebElement male;
@FindBy(xpath="(//input)[15]") private WebElement  militaryservice;
@FindBy(xpath="(//i)[@class='oxd-icon bi-check oxd-checkbox-input-icon'][1]") private WebElement smoker;
@FindBy(xpath="(//button)[3]") private WebElement save;

public MyInfoPD (WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}

public void clickonfirstname() throws AWTException, IOException  {
	firstname.click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_DELETE);
	r.keyRelease(KeyEvent.VK_CONTROL);	
	ExcelUtility eu =new ExcelUtility();
	String firstName=eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,0);
	firstname.sendKeys(firstName);
	du.takeScreenshot();
	du.takeScreenshot();
	
}
	
	public void clickonmiddlename() throws AWTException, IOException {
		middilename.click();
		du.robotAction();
		du.takeScreenshot();
		ExcelUtility eu =new ExcelUtility();
		String middilename = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,1);
		this.middilename.sendKeys(middilename);
		
		
	}
	public void clickonlastname() throws AWTException, IOException {
		lastname.click();
		du.robotAction();
		ExcelUtility eu =new ExcelUtility();
		String lastname = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,2);
		this.lastname.sendKeys(lastname);
		du.takeScreenshot();
		
	}
	 {
		// TODO Auto-generated method stub
		
	}

	public void clickonnickname() throws AWTException {
		nickname.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_CONTROL);
		ExcelUtility eu =new ExcelUtility();
		String nickname = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,3);
		this.nickname.sendKeys(nickname);
		
		
		
	}
	
	public void clickonemployeeID() throws AWTException, IOException {
		employeeID.click();
		du.robotAction();
		ExcelUtility eu =new ExcelUtility();
		String employeeID = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,4);
		this.employeeID.sendKeys(employeeID);
		du.takeScreenshot();
	}
	public void clickonotheID() throws AWTException, IOException {
		otheID.click();
		du.robotAction();
		ExcelUtility eu =new ExcelUtility();
		String otheID = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,5);
		this.otheID.sendKeys(otheID);
		du.takeScreenshot();
		
	}
	
	
	public void clickondriverslicence() throws AWTException {
		
		driverslicence.click();
		du.robotAction();
		ExcelUtility eu =new ExcelUtility();
		String driverslicence = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,6);
		this.driverslicence.sendKeys(driverslicence);
		
		
	}
	public void clickonlicenceexpirydate() throws AWTException, IOException {
		licenceexpirydate.click();
		du.robotAction();
		ExcelUtility eu =new ExcelUtility();
		String licenceexpirydate = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,7);
		this.licenceexpirydate.sendKeys(licenceexpirydate);
		du.takeScreenshot();
	}
	public void clickonssnnumber() throws AWTException {
		ssnnumber.click();
		du.robotAction();
		ExcelUtility eu =new ExcelUtility();
		String ssnnumber = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,8);
		this.ssnnumber.sendKeys(ssnnumber);
		
		
	}
	
	public void clickonsinnumber() throws AWTException {
		sinnumber.click();
		du.robotAction();
		ExcelUtility eu =new ExcelUtility();
		String sinnumber = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,9);
		this.sinnumber.sendKeys(sinnumber);
		
	}
	
	public void clickondob() throws AWTException {
		dob.click();
		du.robotAction();
		ExcelUtility eu =new ExcelUtility();
		String dob = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,10);
		this.dob.sendKeys(dob);
	}
	public void clickonmale() throws AWTException {
		male.click();
		
	}
	
	public void clickonmilitaryservice() {
		
		
		ExcelUtility eu =new ExcelUtility();
		String militaryservice = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,12);
		this.militaryservice.sendKeys(militaryservice);
	}
	
	public void clickonsmoker() {
		
		smoker.click();
	}

public void clickonsave() throws IOException{
	
	save.click();
	du.takeScreenshot();
	


}
}