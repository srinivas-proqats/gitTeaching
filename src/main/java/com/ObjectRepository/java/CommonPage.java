package com.ObjectRepository.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	
	@FindBy(xpath="//a[text()='Contact Details']") private WebElement contactdetails;
	@FindBy(xpath = "//span[text()='Admin']")private WebElement Adminpanel;
	
	@FindBy(xpath = "//span[text()='PIM']")	private WebElement PIM;

	@FindBy(xpath = "//span[text()='Leave']")private WebElement Leave;
	
	@FindBy(xpath = "//span[text()='Time']")private WebElement Time;
	
	@FindBy(xpath = "//span[text()='Recruitment']")	private WebElement Recruitment;

	@FindBy(xpath = "//span[text()='My Info']")private WebElement MyInfo; //span[text()='My Info']
	
	@FindBy(xpath = "//span[text()='Performance']") private WebElement Performance;
	
	@FindBy(xpath ="//span[text()='Directory']") private WebElement Directory;
	
	@FindBy(xpath ="//span[text()='Maintenance']") private WebElement Maintenence;
	
	@FindBy(xpath ="//span[text()='Buzz']") private WebElement Buzz;
	
	
	
	public CommonPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonAdminpanel() {
		Adminpanel.click();
	}
	
	public void clickonPIM() {
		PIM.click();
	}
	public void clickonLeave() {
		Leave.click();
	}
	public void clickonTime() {
		Time.click();
	}
	public void cickonRecruitment() {
		Recruitment.click();
	}
	public void clickonMyInfo() {
		MyInfo.click();
	}
	
	

	
	public void clickonPerformance() {
		Performance.click();
	}
	public void clickonDirectory() {
		Directory.click();
	}
	public void clickonMaintenence() {
		Maintenence.click();
	}
	public void clickonBuzz() {
		Buzz.click();
	}
	public void clickoncontactdetails() {
		contactdetails.click();
	}


	

	
	
	
	
	
}
