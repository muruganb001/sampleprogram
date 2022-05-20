package org.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DemoQa extends BaseClassMethods{

	
	public DemoQa() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	@FindBy(id="gender-radio-1")
	private WebElement gender;
	public WebElement getGender() {
		return gender;
	}
	@FindBy(id="userNumber")
	private WebElement  mobileno;
	public WebElement getMobileno() {
		return mobileno;
	}
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	public WebElement getDob() {
		return dob;
	}
	
	private WebElement sub;
	public WebElement getSub() {
		return sub;
	}
	@FindBy(id="hobbies-checkbox-1")
	private WebElement hobbies;
	public WebElement getHobbies() {
		return hobbies;
	}
	private WebElement address;

		public WebElement getAddress() {
		return address;
	}
	
	
	

}


