package com.OrangeHRM.genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

//this class contain WebDriver reusable methods
public class DriverUtility {
	
	WebDriver driver;

	/*
	 * this method contain set the application..open the browser, maximize, and
	 * provideimpicitlywait wait.
	 * 
	 * @param browser
	 * 
	 * @param timeout
	 * 
	 * @pram url
	 * 
	 * @return
	 */
	public WebDriver openApplication(String browser, long timeout, String url) {
		// WebDriver driver=null;
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

	public void logoutBrowser(WebDriver driver) {
		driver.findElement(By.xpath("")).click();
	}

	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

	/**
	 * used to wait for a element to be clickable in gui,and check for specific
	 * element
	 */
	public void scriptTimeout(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

	}

	/*
	 * public void waitForElementToBeClickable(WebDriver driver,WebElement Element)
	 * {
	 *//**
		 * used to wait for a element to be clickable in gui,and check for specific
		 * element
		 *//*
			 * WebDriverWait wait =new WebDriverWait(driver,10);
			 * wait.until(ExpectedConditions.elementToBeClickable(Element )); }
			 */

	public void MouseHoverMovToElement(WebDriver driver, WebElement element) {

		/**
		 * this method provide the functionality to hover the mouse to a particular
		 * element.
		 */
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public void rightClick(WebDriver driver, WebElement element) {

		/**
		 * this method provide the functionality to perform right click on the desired
		 * elemnet
		 */
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public void doubleClick(WebDriver driver, WebElement element) {

		/**
		 * this method provide the functionality to perform doubleclick on a particular
		 * element
		 */

		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void dragAndDrop(WebDriver driver, WebElement element) {

		/**
		 * this method provide the functionality to perform dragAndDrop on a particular
		 * element
		 */
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element).perform();

	}

	public void SelectByvisibleText(WebElement element, String text) {

		/**
		 * this method provide the functionality to select the element based on the
		 * visible text.
		 */
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void SelectByvalue(WebElement element, String text) {

		/**
		 * this method provide the functionality to select the element based on the
		 * values of HTMl codes.
		 */
		Select s = new Select(element);
		s.selectByValue(text);
	}

	public void SelectByindex(WebElement element, int num) {

		/**
		 * this method provide the functionality to select the element based on the
		 * values of HTML codes.
		 */
		Select s = new Select(element);
		s.selectByIndex(num);

	}

	public void switchToFrameByIndex(WebDriver driver, int index) {
		/**
		 * this method provide the functionality switch the window on the basis on
		 * index.
		 */
		driver.switchTo().frame(index);

	}

	public void switchToFrameAttribute(WebDriver driver, String id) {
		/**
		 * this method provide the functionality switch the window on the basis on
		 * attribute.
		 */
		driver.switchTo().frame(id);
	}

	public void switchToAlertAccept(WebDriver driver) {
		/**
		 * this method provide the functionality to click OK(accept)
		 */
		driver.switchTo().alert().accept();
	}

	public void switchToAlertDismiss(WebDriver driver) {

		/**
		 * this method provide the functionality to click CANCEL(dismiss)
		 */

		driver.switchTo().alert().dismiss();

	}

	public void scrollintoview(WebElement element, WebDriver driver) {
		/**
		 * this method provide the functionality to scrolldown the pages.
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0]. scrollintoview()", element);
	}

	public By covertStringToBy(String xpath) {
		/**
		 * this method provide the functionality to convert string to By type.
		 */
		return By.xpath(xpath);

	}
	
	  public String takeScreenshot(String testName) throws Throwable {
	  
	  
	  SimpleDateFormat formatter=new SimpleDateFormat("DD_MM_YYYY_HH_mm_sss"); Date
	  date=new Date(); String time=formatter.format(date);
	  System.out.println(time); 
	  
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  java.io.File src=ts.getScreenshotAs(OutputType.FILE); 
	  File dest=new
	  File("./screenshot/"+testName+"_"+time+".PNG"); FileUtils.copyFile(src,
	  dest); 
	  return dest.getAbsolutePath(); 
	  }
	 

	public String takeScreenshot() {
        TakesScreenshot ts = (TakesScreenshot) driver;
        String src = ts.getScreenshotAs(OutputType.BASE64);
        return src;
	}
	public void robotAction() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

}
