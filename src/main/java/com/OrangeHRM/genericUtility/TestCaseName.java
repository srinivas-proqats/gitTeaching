package com.OrangeHRM.genericUtility;

public enum TestCaseName {
	
	MyAccount("MyAccount");
	private String testCaseName;
	private TestCaseName(String testCaseName)
	{
		this.testCaseName=testCaseName;
		
	}
	public String convertString() {
		return testCaseName.toString();
	}

}
