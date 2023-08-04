package com.ObjectRepository.java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.ExcelUtility;
import com.OrangeHRM.genericUtility.IConstantpath;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	public class Buzz {
		@FindBy(xpath="//textarea") private WebElement mind;
		@FindBy(xpath="//div[@class='oxd-buzz-post-slot']")private WebElement post;
public Buzz (WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickonmind() {
	mind.click();
	ExcelUtility eu =new ExcelUtility();
	String mind=eu.getExcelData(IConstantpath.excelpath,"Buzz",1,0);
	this.mind.sendKeys(mind);
	
}

public void clickonpost() {
	post.click();
	System.out.println("posted succesfully");
	
	
}

}