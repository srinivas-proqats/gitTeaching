package com.OrangeHRM.genericUtility;

public enum KeysPropertyFile {
	
	Browser("browser"),Username("username"),PassWord("password"),Url("url"),TimeOut("timeout"),Limit("limit");
	//setter
	private String Keys;
	KeysPropertyFile(String keys){
		this.Keys=keys;
	}
public String convertToString() {
	return Keys.toString();
}
}
