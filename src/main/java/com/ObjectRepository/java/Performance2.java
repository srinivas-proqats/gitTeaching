package com.ObjectRepository.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.DriverUtility;
import com.OrangeHRM.genericUtility.ExcelUtility;
import com.OrangeHRM.genericUtility.IConstantpath;

public class Performance2 {
	DriverUtility du=new DriverUtility();
	@FindBy(xpath="//span[text()='Configure ']") private WebElement configure;
	@FindBy(xpath="//a[text()='Trackers']")  private WebElement trackers;
	@FindBy(xpath="//button[@type='button']/i[@class='oxd-icon bi-plus oxd-button-icon']") private WebElement add;
	@FindBy(xpath="(//div/input)[2]") private WebElement trackername;
	@FindBy(xpath="(//input)[@placeholder='Type for hints...'][1]") private WebElement empname;
	@FindBy(xpath="(//div/input)[4]") private WebElement review;
	@FindBy(xpath="//button[@type='submit']") private WebElement save;
	
public Performance2 (WebDriver driver) {
    	
    	PageFactory.initElements(driver, this);
    }
	

public void clickonconfigure() {
	configure.click();
}

public void clickontrackers() {
	trackers.click();
}

public void clickadd() {
	add.click();
}

public void clickontrackername() {
	trackername.click();
	ExcelUtility eu =new ExcelUtility();
	String trackername = eu.getExcelData(IConstantpath.excelpath,"Performance2",1,0);
	this.trackername.sendKeys(trackername);
}

public void clickoempname() {
	empname.click();
	ExcelUtility eu =new ExcelUtility();
	String empname = eu.getExcelData(IConstantpath.excelpath,"Performance2",1,1);
	this.empname.sendKeys(empname);
}


public void clickonreview() {
	review.click();
	ExcelUtility eu =new ExcelUtility();
	String review = eu.getExcelData(IConstantpath.excelpath,"Performance2",1,2);
	this.review.sendKeys(review);
}
public void clickonsave() throws Throwable {
	save.click();
	
	
}

}
