package org.basic;

import org.testng.annotations.Test;

public class TestngProgram {
	@Test(priority=1)
	private void tc0() {
System.out.println("bala");
	}
	@Test(enabled=false)
	private void tc01() {
System.out.println("murugan");
	}
	@Test
	private void tc02() {
System.out.println("rsjs");
	}
	
}
