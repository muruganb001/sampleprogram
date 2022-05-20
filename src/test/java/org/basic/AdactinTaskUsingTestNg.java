package org.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinTaskUsingTestNg extends BaseClassMethods{
	@Test
	private void tc0() {
		getDriver();
		launch("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	}
	@Parameters({"keysToSend","pass"})
	@Test
	private void tc1(String keysToSend, String pass) {
		AdactinHotelTask a = new AdactinHotelTask();
		WebElement username = a.getUsername();
		username.sendKeys(keysToSend);
		
		WebElement password = a.getPassword();
		password.sendKeys(pass);
		
		a.getLogin().click();
	
	}
	@Test
	private void tc2() {
		AdactinHotelTask a = new AdactinHotelTask();
		WebElement location = a.getLocation();
		new Select(location).selectByValue("Brisbane");
		WebElement roomnos = a.getRoomnos();
		new Select(roomnos).selectByValue("4");
		WebElement adultperroom = a.getAdultperroom();
		new Select(adultperroom).selectByVisibleText("4 - Four");
		
		WebElement search = a.getSearch();
		search.click();
		
		WebElement selectbutton = a.getSelectbutton();
		selectbutton.click();
		
		WebElement continueclick = a.getContinueclick();
		continueclick.click();
	}
	@Parameters({"firstname","lastname","address","card","cvv"})
	@Test
	private void tc3(String firstname,String lastname,String address,
			String card,String cvv) {
		AdactinHotelTask a = new AdactinHotelTask();
		a.getFirstName().sendKeys(firstname);
		a.getLastName().sendKeys(lastname);
		a.getAddress().sendKeys(address);
		a.getCardno().sendKeys(card);
		WebElement cardtype = a.getCardtype();
		new Select(cardtype).selectByValue("VISA");
		
		WebElement expmonth = a.getExpmonth();
		new Select(expmonth).selectByVisibleText("February");
		
		WebElement expyear = a.getExpyear();
		new Select(expyear).selectByValue("2022");
		
		a.getCvv().sendKeys(cvv);
		
		WebElement booknow = a.getBooknow();
		booknow.click();
		
	}
//	<parameter name="keysToSend" value="Bala1995"></parameter>
//	  <parameter name="pass" value="12345678"></parameter>
//	  <parameter name="firstname" value="bala"></parameter>
//	  <parameter name="lastname" value="murugan"></parameter>
//	  <parameter name="address" value="trichy"
//	  <parameter name="card" value="1234567890123456"
//	  <parameter name="cvv" value="456"
	

}
