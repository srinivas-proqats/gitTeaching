package com.ObjectRepository.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.ExcelUtility;
import com.OrangeHRM.genericUtility.IConstantpath;

public class Recruitement {
	
@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") private WebElement Add;
@FindBy(xpath="//input[@name='firstName']")private WebElement FirstName;
@FindBy(xpath="//input[@name='middleName']") private WebElement MiddleName;
@FindBy(xpath="//input[@name='lastName']") private WebElement LastName;
@FindBy(xpath="(//input)[5]")	private WebElement email;
@FindBy(xpath="(//input)[6]") private WebElement contact;
@FindBy(xpath="//div[text()='Browse']") private WebElement fileupload;

@FindBy(xpath="//input[@placeholder='Enter comma seperated words...']") private WebElement keywords;
@FindBy(xpath="//input[@placeholder='yyyy-mm-dd']") private WebElement calender;
@FindBy(xpath="(//textarea)") private WebElement typehere;
@FindBy(xpath="(//span)[14]") private WebElement keepdata;
@FindBy(xpath=" //button[text()=' Save ']") private WebElement save;
	public Recruitement (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickonadd() {
		Add.click();
	}
	public void clickonFirstName() {
		FirstName.click();
		ExcelUtility eu =new ExcelUtility();
		String FirstName = eu.getExcelData(IConstantpath.excelpath,"PersonalData",9,0);
		this.FirstName.sendKeys(FirstName);
	}
	public void clickonMiddleName() {
		MiddleName.click();
		ExcelUtility eu =new ExcelUtility();
		String MiddleName = eu.getExcelData(IConstantpath.excelpath,"PersonalData",9,1);
		this.MiddleName.sendKeys(MiddleName);
	}
	
	public void clickonLastName() {
		LastName.click();
		ExcelUtility eu =new ExcelUtility();
		String LastName = eu.getExcelData(IConstantpath.excelpath,"PersonalData",9,2);
		this.LastName.sendKeys(LastName);
	}
	
	public void clickonemail() {
		email.click();
		ExcelUtility eu =new ExcelUtility();
		String email = eu.getExcelData(IConstantpath.excelpath,"PersonalData",9,3);
		this.email.sendKeys(email);
	}
	
	public void clickoncontact() {
		contact.click();
		ExcelUtility eu =new ExcelUtility();
		String contact = eu.getExcelData(IConstantpath.excelpath,"PersonalData",9,4);
		this.contact.sendKeys(contact);
	}
	public void clickonfileupload() {
		fileupload.click();
		
		WebElement ele = fileupload;
		ele.sendKeys("C:\\Users\\PGPL User 18\\Desktop\\resumes\\lll");
	
		
	}
	
	public void clickonkeywords() {
		keywords.click();
		ExcelUtility eu =new ExcelUtility();
		String keywords = eu.getExcelData(IConstantpath.excelpath,"PersonalData",9,5);
		this.keywords.sendKeys(keywords);
	}
	
	public void clickoncalender() throws AWTException {
		calender.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_CONTROL);
		ExcelUtility eu =new ExcelUtility();
		String calender = eu.getExcelData(IConstantpath.excelpath,"PersonalData",1,6);
		this.calender.sendKeys(calender);
	}
	
	public void clickontypehere() {
		typehere.click();
		ExcelUtility eu =new ExcelUtility();
		String typehere = eu.getExcelData(IConstantpath.excelpath,"PersonalData",9,7);
		this.typehere.sendKeys(typehere);
	}
	
	public void clickonkeepdata() {
		keepdata.click();
	}
	
	public void clickonsave() {
		save.click();
	}
	
	
		
		
		
		
	
	
	
	
}
