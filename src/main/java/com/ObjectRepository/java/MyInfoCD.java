package com.ObjectRepository.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.DriverUtility;
import com.OrangeHRM.genericUtility.ExcelUtility;
import com.OrangeHRM.genericUtility.IConstantpath;

public class MyInfoCD {
	DriverUtility du=new DriverUtility();
	@FindBy(xpath = "(//input)[2]")private WebElement Street1;
	@FindBy(xpath = "(//input)[3]")private WebElement street2;
	@FindBy(xpath = "(//input)[4]")private WebElement city;
	@FindBy(xpath = "(//input)[@class='oxd-input oxd-input--active'][5]")private WebElement state;
	@FindBy(xpath = "(//input)[@class='oxd-input oxd-input--active'][6]")private WebElement zip;
	@FindBy(xpath = "(//input)[@modelmodifiers='[object Object]'][1]")private WebElement home;
	@FindBy(xpath = "(//input)[@class='oxd-input oxd-input--active'][7]")private WebElement mobile;
	@FindBy(xpath = "(//input)[@class='oxd-input oxd-input--active'][8]")private WebElement work;
	@FindBy(xpath = "(//input)[@class='oxd-input oxd-input--active'][9]")
	private WebElement email;
	@FindBy(xpath = "(//input)[@class='oxd-input oxd-input--active'][10]")
	private WebElement otheremail;
	@FindBy(xpath = "(//button)[@type='submit'][1]")
	private WebElement save;

	public MyInfoCD(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickonstreet1() throws AWTException {

		Street1.click();
		du.robotAction();
		ExcelUtility eu = new ExcelUtility();
		String street1 = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 0);
		Street1.sendKeys(street1);
	}

	public void clickonstreet2() throws AWTException {
		street2.click();
		du.robotAction();
		ExcelUtility eu = new ExcelUtility();
		String street2 = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 1);
		this.street2.sendKeys(street2);

	}

	public void clickoncity() {
		city.click();

		ExcelUtility eu = new ExcelUtility();
		String city = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 2);
		this.city.sendKeys(city);
	}

	public void clickonstate() {
		state.click();
		ExcelUtility eu = new ExcelUtility();
		String state = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 3);
		this.state.sendKeys(state);

	}

	public void clickonzip() {
		zip.click();
		ExcelUtility eu = new ExcelUtility();
		String zip = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 4);
		this.zip.sendKeys(zip);

	}

	public void clickonhome() {
		home.click();
		ExcelUtility eu = new ExcelUtility();
		String home = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 5);
		this.home.sendKeys(home);

	}

	public void clickonmobile() {
		mobile.click();
		ExcelUtility eu = new ExcelUtility();
		String mobile = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 6);
		this.mobile.sendKeys(mobile);

	}

	public void clickonwork() throws AWTException {
		work.click();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_CONTROL);
		ExcelUtility eu = new ExcelUtility();
		String work = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 7);
		this.work.sendKeys(work);

	}

	public void clickonemail() throws AWTException {
		email.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_CONTROL);
		ExcelUtility eu = new ExcelUtility();
		String email = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 8);
		this.email.sendKeys(email);
	}

	public void clickonotheremail() {
		otheremail.click();
		ExcelUtility eu = new ExcelUtility();
		String otheremail = eu.getExcelData(IConstantpath.excelpath, "PersonalData", 3, 9);
		this.otheremail.sendKeys(otheremail);

	}

	public void clickonsave() {
		save.click();

	}

}