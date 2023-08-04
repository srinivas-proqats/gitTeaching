package com.ObjectRepository.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericUtility.ExcelUtility;
import com.OrangeHRM.genericUtility.IConstantpath;

public class Performance {
	
	
	@FindBy(xpath="//span[text()='Manage Reviews ']") private WebElement managereviews;
	@FindBy(xpath="//a[text()='My Reviews']") private WebElement myreviews;
	@FindBy(xpath="//button[@title='Evaluate']") private WebElement Addbutton;
	@FindBy(xpath="(//input)[2]") private WebElement rating;
	@FindBy(xpath="(//textarea)[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical orangehrm-evaluation-grid-comment'][1]") private WebElement comments;
	@FindBy(xpath="(//input)[@class='oxd-input oxd-input--active'][3]") private WebElement rating2;
	@FindBy(xpath="(//textarea)[2]") private WebElement comment2;
	@FindBy(xpath="(//input)[@class='oxd-input oxd-input--active'][4]") private WebElement rating3;
	@FindBy(xpath="(//textarea)[3]") private WebElement comment3;
	@FindBy(xpath="(//input)[@class='oxd-input oxd-input--active'][5]") private WebElement rating4;
	@FindBy(xpath="(//textarea)[4]") private WebElement comment4;
	@FindBy(xpath="(//textarea)[1]]") private WebElement rating5;
	@FindBy(xpath="(//textarea)[5]") private WebElement comment5;
	@FindBy(xpath="(//textarea)[6]") private WebElement generalcomment;
    @FindBy(xpath=" //button[text()=' Complete ']") private WebElement complete;

    public Performance (WebDriver driver) {
    	
    	PageFactory.initElements(driver, this);
    }
    
    public void clickonmanagereviews() {
    	managereviews.click();
    }
    
    public void clickonmyreviews() {
    	myreviews.click();
    }
    public void clickonAddbutton() {
    	Addbutton.click();
    }
    public void clickonrating() {
    	rating.click();
    	ExcelUtility eu =new ExcelUtility();
		String rating = eu.getExcelData(IConstantpath.excelpath,"Performance",1,0);
		this.rating.sendKeys(rating);
		
    }
    public void clickoncomments() {
    	comments.click();
    	ExcelUtility eu =new ExcelUtility();
		String comments = eu.getExcelData(IConstantpath.excelpath,"Performance",1,1);
		this.comments.sendKeys(comments);
		
    	
    }
    public void clickonrating2() {
    	rating2.click();
    	ExcelUtility eu =new ExcelUtility();
		String rating2 = eu.getExcelData(IConstantpath.excelpath,"Performance",1,2);
		this.rating2.sendKeys(rating2);
		
    }
    public void clickoncomment2() {
    	comment2.click();
    	rating2.click();
    	ExcelUtility eu =new ExcelUtility();
		String comment2 = eu.getExcelData(IConstantpath.excelpath,"Performance",1,3);
		this.comment2.sendKeys(comment2);
		
    }
    public void clickonrating3() {
    	rating3.click();
    	
    	ExcelUtility eu =new ExcelUtility();
		String rating3 = eu.getExcelData(IConstantpath.excelpath,"Performance",1,4);
		this.rating3.sendKeys(rating3);
		
    }
    public void clickoncomment3() {
    	comment3.click();
    	ExcelUtility eu =new ExcelUtility();
		String comment3 = eu.getExcelData(IConstantpath.excelpath,"Performance",1,5);
		this.comment3.sendKeys(comment3);
		
    }
    public void clickonrating4() {
    	rating4.click();
    	ExcelUtility eu =new ExcelUtility();
		String rating4 = eu.getExcelData(IConstantpath.excelpath,"Performance",1,6);
		this.rating4.sendKeys(rating4);
		
    }
    public void clickoncomment4() {
    	comment4.click();
    	ExcelUtility eu =new ExcelUtility();
		String comment4 = eu.getExcelData(IConstantpath.excelpath,"Performance",1,7);
		this.comment4.sendKeys(comment4);
		
    }
    public void clickonrating5() {
    	rating5.click();
    	ExcelUtility eu =new ExcelUtility();
		String rating5 = eu.getExcelData(IConstantpath.excelpath,"Performance",1,8);
		this.rating5.sendKeys(rating5);
		
    }
    public void clickoncomment5() {
    	comment5.click();
    	ExcelUtility eu =new ExcelUtility();
		String comment5 = eu.getExcelData(IConstantpath.excelpath,"Performance",1,9);
		this.comment5.sendKeys(comment5);
		
    	
    }
    public void clickongeneralcomment() {
    	generalcomment.click();
    	ExcelUtility eu =new ExcelUtility();
		String generalcomment = eu.getExcelData(IConstantpath.excelpath,"Performance",1,10);
		this.generalcomment.sendKeys(generalcomment);
    }
    public void clickoncomplete() {
    	complete.click();
    }
    
    
    
    
    

}

