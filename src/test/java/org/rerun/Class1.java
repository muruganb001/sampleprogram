package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	private void tc01() {
		System.out.println("bala");
	}
	@Test
	private void tc02() {
		System.out.println("murugan");
	}
	@Test
	private void tc03() {
		System.out.println("balamurugan");
	}
	@Test
	private void tc04() {
	Assert.assertTrue(false);
		System.out.println("123456789");
		System.out.println("balamurugan");
	}

}
