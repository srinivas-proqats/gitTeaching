package com.ObjectRepository.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.DriverUtility;

public class Loginpage {
	
	DriverUtility du=new DriverUtility();
	@FindBy(xpath="//input[@name='username']")private WebElement userNameTextBox;
	@FindBy(name = "password")	private WebElement passwordTextBox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	

	public Loginpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void loginactions(String username, String password) {
		
		
		userNameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		loginButton.click();
		
	}
}
