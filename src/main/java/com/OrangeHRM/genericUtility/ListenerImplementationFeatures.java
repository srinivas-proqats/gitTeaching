package com.OrangeHRM.genericUtility;
import org.testng.ITestContext;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementationFeatures {
	ExtentTest test;
	ExtentReports report;
	
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
		ThreadSafe.setExtentTest(test);
	}
	
	public void onTestSuccess(ITestResult result) {
		ThreadSafe.getExtentTest().pass(result.getMethod().getMethodName());
		//test.info("this info coming from script");
		//test.pass("test case pass");
	}
	public void onTestFailure(ITestResult result) {
		test.fail("test case fail");
		try {
			// string ss = ThreadSafe.getdriverUtility().takeScreenshot(result.getmethod().getMethodName());
            // ThreadSafe.getExtentTest().addscreencaptureFromPath(ss);
             String ss = ThreadSafe.getdriverUtility().takeScreenshot();
             ThreadSafe.getExtentTest().addScreenCaptureFromBase64String(ss);
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
public void onTestSkipped(ITestResult result) {
	ThreadSafe.getExtentTest().skip(result.getMethod().getMethodName());
	//test.skip("skip this");
}
public void onStart(ITestContext context) {
	ExtentSparkReporter spark=new ExtentSparkReporter("./extentReport/extentHtmlReport.html");
	spark.config().setDocumentTitle("Document Title");
	spark.config().setDocumentTitle("Report Name");
	spark.config().setTheme(Theme.STANDARD);
	report=new ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("operating system","Window 10");
	report.setSystemInfo("Browser name", "Chrome");
	report.setSystemInfo("Browser version", "114");
	report.setSystemInfo("Reporter name", "venkatesh");
	
	
}
public void onFinish(ITestContext context) {
	report.flush();
}

}