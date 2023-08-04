package com.ObjectRepository.java;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.DriverUtility;
import com.OrangeHRM.genericUtility.ExcelUtility;
import com.OrangeHRM.genericUtility.IConstantpath;

public class Admin {
DriverUtility du=new DriverUtility();

	@FindBy(xpath="//span[text()='Configuration ']") private WebElement configuration;
	@FindBy(xpath="//a[@role='menuitem' and text()='Email Configuration']") private WebElement emailconfigaration;
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']") private WebElement email;
	@FindBy(xpath="(//span)[20]") private WebElement smtp;
	@FindBy(xpath="(//input)[@class='oxd-input oxd-input--active'][3]") private WebElement smtphost;
	@FindBy(xpath="(//input)[@class='oxd-input oxd-input--active'][4]") private WebElement smtpport;
@FindBy(xpath="//input[@type='radio' and @value='login']") private WebElement checkyes;
@FindBy(xpath="(//span)[@class='oxd-switch-input oxd-switch-input--active --label-right'][1]") private WebElement toggle1;
@FindBy(xpath="(//span)[@class='oxd-switch-input oxd-switch-input--active --label-right'][2]") private WebElement toggle2;
@FindBy(xpath="//button[text()=' Save ']") private WebElement save;

public Admin (WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}

public void clickonconfiguration() {
	configuration.click();
}

public void clickonemailconfigaration() {
	emailconfigaration.click();
}


public void clickonemail() throws AWTException {
	email.click();
	du.robotAction();
	ExcelUtility eu =new ExcelUtility();
	String email = eu.getExcelData(IConstantpath.excelpath,"Admin",1,0);
	this.email.sendKeys(email);
}
public void clickonsmtp() {
	smtp.click();
}
public void clikonsmtphost() {
	smtphost.click();
	ExcelUtility eu =new ExcelUtility();
	String smtphost = eu.getExcelData(IConstantpath.excelpath,"Admin",1,1);
	this.smtphost.sendKeys(smtphost);
	
}
public void clickonsmtpport() {
	smtpport.click();
	ExcelUtility eu =new ExcelUtility();
	String smtpport = eu.getExcelData(IConstantpath.excelpath,"Admin",1,2);
	this.smtpport.sendKeys(smtpport);
}
public void clickcheckyes() {
	checkyes.click();
}
public void clickontoggle1() {
	toggle1.click();
}
public void clickontoggle2() {
	toggle2.click();
}














}
