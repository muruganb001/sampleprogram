package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Class2 implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer retryAnalyzer = arg0.getRetryAnalyzer();
		if (retryAnalyzer==null) {
			arg0.setRetryAnalyzer(Class3.class);
			
		}
		
	}

}
