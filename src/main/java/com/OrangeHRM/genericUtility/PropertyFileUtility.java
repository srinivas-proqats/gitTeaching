package com.OrangeHRM.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	private FileInputStream fis=null;
	public String getDataFromPropertyFile(String key,String propertyFilePath) {
		try {
			fis=new FileInputStream(propertyFilePath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties p=new Properties();
		try {
			p.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
		String data=p.getProperty(key);
		return data;
	}
	public void closePropertyFile() {
		try {
			fis.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
