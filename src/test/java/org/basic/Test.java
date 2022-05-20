package org.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TestingTool t = new TestingTool();
		WebElement userName = t.getUserName();
		userName.sendKeys("bala@gmail.com");
		driver.navigate().refresh();
		userName.sendKeys("murugan@gmail.com");
		
	}

}
