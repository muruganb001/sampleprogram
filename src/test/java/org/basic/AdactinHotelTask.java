package org.basic;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelTask extends BaseClassMethods {
	
	public AdactinHotelTask() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="username")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	@FindBy(id="login")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	@FindBy(id="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	@FindBy(id="room_nos")
	private WebElement roomnos;
	

	public WebElement getRoomnos() {
		return roomnos;
	}
	@FindBy(id="adult_room")
	private WebElement adultperroom;
	public WebElement getAdultperroom() {
		return adultperroom;
	}

	@FindBy(id="Submit")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	
	
	@FindBy(id="continue")
	private WebElement continueclick;

	public WebElement getContinueclick() {
		return continueclick;
	}
	@FindBy(id="radiobutton_1")
	private WebElement selectbutton;
	

	public WebElement getSelectbutton() {
		return selectbutton;
	}
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	public WebElement getFirstName() {
		return FirstName;
	}

	@FindBy(id="last_name")
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(id="address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
@FindBy(id="cc_num")
	private WebElement cardno;

	public WebElement getCardno() {
		return cardno;
	}
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	public WebElement getCardtype() {
		return cardtype;
	}
	
@FindBy(id="cc_exp_month")
	private WebElement expmonth;

	public WebElement getExpmonth() {
		return expmonth;
	}

	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	public WebElement getExpyear() {
		return expyear;
	}

	@FindBy(id="cc_cvv")
	private WebElement cvv;
	public WebElement getCvv() {
		return cvv;
	}

	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy(id="hotels")
	private WebElement hotelname;

	public WebElement getHotelname() {
		return hotelname;
	}
//	public void AdactinHotelTaskProgram(String name, int row, int cell) throws IOException {
//		getUsername().sendKeys(getDataFromExcel(name, row, cell));
//		getPassword().sendKeys(getDataFromExcel(name, row, cell));
//		getFirstName().sendKeys(getDataFromExcel(name, row, cell));
//		getLastName().sendKeys(getDataFromExcel(name, row, cell));
//		getAddress().sendKeys(getDataFromExcel(name, row, cell));
//		
//	}
	
	

	
	
	
	

}
