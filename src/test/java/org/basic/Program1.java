package org.basic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class Program1 extends BaseClassMethods {
	@Test
	public void tc0()  {
		getDriver();
		launch("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	

}
