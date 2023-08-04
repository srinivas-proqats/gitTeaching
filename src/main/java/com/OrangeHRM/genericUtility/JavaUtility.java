package com.OrangeHRM.genericUtility;

import java.util.Random;

public class JavaUtility {

	public int generateRandomNumber(int limit) {
		return new Random().nextInt(limit);

		/*
		 * or Random r=new Random(); int ranNum=r.nextInt(1000); return ranNum;
		 */
	}

	// to to int
	public int convertInt(String s) {

		int a = Integer.parseInt(s);
		return a;
	}

	// convert to long
	public long covertToLong(String s) {
		long l = Long.parseLong(s);
		return l;

	}

	// convert to float
	public float convertToFloat(String s) {
		float f = Float.parseFloat(s);
		return f;
	}

	// convert to double
	public double covertToDouble(String s) {
		double d = Double.parseDouble(s);
		return d;
	}

	// covert to any datatype
	public Object convertToAnyDataType(String value, String strategy) {
		Object data = null;
		if (strategy.equals("init")) {
			data = Integer.parseInt(value);

		} else if (strategy.equals("long")) {
			data = Long.parseLong(value);
		} else if (strategy.equals("float")) {
			data = Float.parseFloat(value);

		} else if (strategy.equals("double")) {
			data = Double.parseDouble(value);
		}
		return data;
	}

}
