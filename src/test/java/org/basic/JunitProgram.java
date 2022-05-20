package org.basic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitProgram {
	@BeforeClass
	public static void tc1() {
		System.out.println("123");

	}
	@Before
	public  void tc2() {
		System.out.println("456");

	}
	@Test
	public void tc3() {
		System.out.println("bala");
	}
	@After
	public void tc4() {
		System.out.println("098");

	}
	@AfterClass
	public static void tc5() {
		System.out.println("56789");

	}

}
