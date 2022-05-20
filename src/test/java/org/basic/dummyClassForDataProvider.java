package org.basic;

import org.testng.annotations.DataProvider;

import com.google.common.collect.ObjectArrays;

public class dummyClassForDataProvider {
	
	@DataProvider(name="login")
	public static String [][] getData() {
		String[][] data = new String[3][2];
		
		return new String[][]{{"bala","123"},{"murugan567","567"},{"balamurugan","789"}};
	
		
		
		
		
	}

}
