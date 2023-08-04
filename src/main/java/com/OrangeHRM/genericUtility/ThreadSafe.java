package com.OrangeHRM.genericUtility;

import com.aventstack.extentreports.ExtentTest;

public class ThreadSafe {
	private static ThreadLocal<DriverUtility>driverUtility=new ThreadLocal<DriverUtility>();
	private static ThreadLocal<ExtentTest>extentTest=new ThreadLocal<ExtentTest>();
	
	public static DriverUtility getdriverUtility() {
		return driverUtility.get();
	}
	
	public static void setdriverUtility(DriverUtility sdriverUtility) {
		driverUtility.set(sdriverUtility);
	}
	public static ExtentTest getExtentTest() {
		return extentTest.get();
	}
public static void setExtentTest(ExtentTest setExtentest) {
	extentTest.set(setExtentest);
}
}
