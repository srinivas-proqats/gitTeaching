package com.OrangeHRM.genericUtility;

public enum SheetName {
	
	SheetName("CustomerDetails");
	private String Keys;
	private SheetName(String Keys) {
		this.Keys=Keys;
		
	}
	public String conveString() {
		return Keys.toString();
	}

}
