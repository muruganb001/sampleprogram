package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParralal {
	WebDriver driver;
	@Parameters("browser")
	@Test
	private void tc01(String value) {
		switch (value) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
//			WebDriverManager.operadriver().setup();
			driver = new EdgeDriver();
//			driver = new OperaDriver();
			driver.get("https://www.facebook.com/");
			break;

		default:
			System.out.println("wrong Browser");
			break;
		}
		driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("bala");
		
		
	}

}
