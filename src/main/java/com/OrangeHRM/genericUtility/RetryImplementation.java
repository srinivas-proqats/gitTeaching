package com.OrangeHRM.genericUtility;

import org.testng.ITestResult;

public class RetryImplementation {
int count=0;
int limit=0;
public boolean retry(ITestResult result) {
	if(count<limit) {
		count++;
		return true;
	}
	return false;
}
}
