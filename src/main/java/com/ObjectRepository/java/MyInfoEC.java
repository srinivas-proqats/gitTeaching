package com.ObjectRepository.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.ExcelUtility;
import com.OrangeHRM.genericUtility.IConstantpath;

public class MyInfoEC {
	@FindBy(xpath="//a[text()='Emergency Contacts']") private WebElement emergencycontacts;
	@FindBy(xpath="(//i)[@class='oxd-icon bi-plus oxd-button-icon'][1]") private WebElement add;
	@FindBy(xpath="(//input)[@class='oxd-input oxd-input--active'][2]")private WebElement Name;
	@FindBy(xpath="(//input)[@class='oxd-input oxd-input--active'][3]") private WebElement Relationship;
	@FindBy(xpath="(//input)[@class='oxd-input oxd-input--active'][4]") private WebElement Hometelephone;
	@FindBy(xpath="(//input)[4]") private WebElement Mobile;
	@FindBy(xpath="(//input)[6]") private WebElement Worktelephone;
	@FindBy(xpath="//button[@type='submit']") private WebElement save;
	

	public MyInfoEC (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonemergenceycontacts() {
		emergencycontacts.click();
		
	}
	
	public void clickonadd() {
		add.click();
		
	}
	
	public void clickonname() {
		
		ExcelUtility eu =new ExcelUtility();
		String name=eu.getExcelData(IConstantpath.excelpath,"PersonalData",5,0);
		Name.sendKeys(name);
	
	}
		public void clickonrelationship() {
			Relationship.click();
			ExcelUtility eu =new ExcelUtility();
			String relationship=eu.getExcelData(IConstantpath.excelpath,"PersonalData",5,1);
			Relationship.sendKeys(relationship);
		
			
		}
		
		public void clickonhometelephone() {
			
			ExcelUtility eu =new ExcelUtility();
			String hometelephone=eu.getExcelData(IConstantpath.excelpath,"PersonalData",5,2);
			Hometelephone.sendKeys(hometelephone);
		
		}
		
		public void clickonmobile() {
			ExcelUtility eu =new ExcelUtility();
			String mobile=eu.getExcelData(IConstantpath.excelpath,"PersonalData",5,3);
			Mobile.sendKeys(mobile);
		
		}
		
		public void clickonWorktelephone() {
			ExcelUtility eu =new ExcelUtility();
			String worktelephone=eu.getExcelData(IConstantpath.excelpath,"PersonalData",5,3);
			Worktelephone.sendKeys(worktelephone);
			
		}
		
		public void clickonsave() {
			save.click();
		}
		
		
	}
	
	
	


