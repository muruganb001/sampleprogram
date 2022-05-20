package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngGrouping {
	@Test(groups="@smoke")
	private void tc01() {
    System.out.println("bala");
	}
	@Test(groups="@smoke")
	private void tc02() {
		Assert.assertTrue(false);
		System.out.println("murugan");
	}
	@Test(groups="@reg")
	private void tc03() {
	System.out.println("balamurgan");		
	}
	@Test(groups="@E2E")
	private void tc04() {
		System.out.println("soma");
	}
	@Test(groups="@smoke")
	private void tc05() {
	System.out.println("sundar");
	}
	@Test(groups="@sanity")
	private void tc06() {
	System.out.println("eswar");	
		
	}

}
