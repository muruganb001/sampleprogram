package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Class3 implements IRetryAnalyzer{
	int min = 0;
	int max = 5;
	@Override
	public boolean retry(ITestResult arg0) {
		if (min<max) {
			min++;
			
			return true;
			
		}
		
		return false;
	}
	
	

}
