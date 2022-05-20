package org.basic;

import org.openqa.selenium.WebElement;

public class DemoQaLaunch extends BaseClassMethods{
	public static void main(String[] args) {
		getDriver();
		launch("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		DemoQa a = new DemoQa();
		WebElement firstName = a.getFirstName();
		textSend(firstName, "bala");
		
		WebElement lastName = a.getLastName();
		textSend(lastName, "murugan");
		
		WebElement email = a.getEmail();
		textSend(email, "bala@gmail.com");
		
		
		
		WebElement mobileno = a.getMobileno();
		textSend(mobileno, "12345678");
		
		WebElement hobbies = a.getHobbies();
		hobbies.click();
	}

}
