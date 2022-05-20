package org.basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

public class TestingMaven {
	@Test()
	private void tc1( ) {
		String s = "bala";
		System.out.println("test1");
		Assert.assertEquals(s, "bala");
		System.out.println(s);
	}
	@Test()
	private void tc2() {
		System.out.println("murugan");

	}
	

}
