package org.basic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinTask extends BaseClassMethods{
	public static void main(String[] args) throws IOException {
		getDriver();
		launch("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		AdactinHotelTask a = new AdactinHotelTask();
		WebElement username = a.getUsername();
		textSend(username, a.getDataFromExcel("b", 0, 0));
		
		WebElement password = a.getPassword();
		textSend(password, a.getDataFromExcel("b", 1, 0));
		
		WebElement login = a.getLogin();
		login.click();
		
		WebElement location = a.getLocation();
		new Select(location).selectByValue("Brisbane");
		
		WebElement hotelname = a.getHotelname();
		new Select(hotelname).selectByValue("Hotel Creek");
		
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
		
		WebElement nameValue = nameValue("order_no");
		
		String attribute = nameValue.getAttribute("value");
		System.out.println(attribute);
		
		File f = new File("G:\\datadriven\\bala.xlsx");
		
		Workbook book = new XSSFWorkbook();
		
		Sheet createSheet = book.createSheet("b");
		Row createRow = createSheet.createRow(7);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue(attribute);
		
		FileOutputStream fo = new FileOutputStream(f);
		
		book.write(fo);
		
		textSend(nameValue, attribute);
		
	}
	
	

}
