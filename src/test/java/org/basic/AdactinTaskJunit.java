package org.basic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class AdactinTaskJunit extends BaseClassMethods{
	@Test
	public void tc0() throws IOException {
		getDriver();
		launch("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		AdactinHotelTask a = new AdactinHotelTask();
		a.getUsername().sendKeys(getDataFromExcel("b", 0, 0));
		a.getPassword().sendKeys(getDataFromExcel("b", 1, 0));
		a.getLogin().click();
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
		WebElement firstName = a.getFirstName();
		textSend(firstName, a.getDataFromExcel("b", 2, 0));
		
		WebElement lastName = a.getLastName();
		textSend(lastName, a.getDataFromExcel("b", 3, 0));
		
		WebElement address = a.getAddress();
		textSend(address, a.getDataFromExcel("b", 4, 0));
		
		WebElement cardno = a.getCardno();
		textSend(cardno, a.getDataFromExcel("b", 5, 0));
		
		WebElement cardtype = a.getCardtype();
		new Select(cardtype).selectByValue("VISA");
		
		WebElement expmonth = a.getExpmonth();
		new Select(expmonth).selectByVisibleText("February");
		
		WebElement expyear = a.getExpyear();
		new Select(expyear).selectByValue("2022");
		
		WebElement cvv = a.getCvv();
		textSend(cvv, a.getDataFromExcel("b", 6, 0));
		
		WebElement booknow = a.getBooknow();
		booknow.click();
		
		
	}

}
