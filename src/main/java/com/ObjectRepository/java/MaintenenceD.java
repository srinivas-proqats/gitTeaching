package com.ObjectRepository.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.ExcelUtility;
import com.OrangeHRM.genericUtility.IConstantpath;

public class MaintenenceD {
	
	@FindBy(xpath="//input[@type='password']")private WebElement changepw;
	@FindBy(xpath=" //button[text()=' Confirm ']") private WebElement confirm;
	@FindBy(xpath="//input[@placeholder='Type for hints...']") private WebElement hints;
	
	
	
	public MaintenenceD (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickonchangepw() {
		changepw.click();
		
		ExcelUtility eu =new ExcelUtility();
		String changepw=eu.getExcelData(IConstantpath.excelpath,"PersonalData",7,0);
		this.changepw.sendKeys(changepw);
	}
	
	
	public void clickonconfirm() {
		confirm.click();
	}
	
	public void clickonhints() {
		hints.click();
		ExcelUtility eu =new ExcelUtility();
		String hints=eu.getExcelData(IConstantpath.excelpath,"PersonalData",7,1);
		this.hints.sendKeys(hints);
		
	}

}
