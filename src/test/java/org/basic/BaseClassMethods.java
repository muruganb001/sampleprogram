package org.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassMethods {
	
	public static WebDriver driver;
	
	public static  WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void launch(String url) {
		driver.get(url);	

	}
	public static WebElement idValue(String idvalue) {
		WebElement findElement = driver.findElement(By.id(idvalue));
		return findElement;
	}
	public static WebElement nameValue(String nameValue) {
		WebElement findElement = driver.findElement(By.name(nameValue));
		return findElement;
	}
	public static WebElement xpathValue(String xpathValue) {
		WebElement findElement = driver.findElement(By.xpath(xpathValue));
		return findElement;
	}
	public static void textSend(WebElement refName, String textValue) {
		refName.sendKeys(textValue);

	}
	public static void buttonClick(WebElement refName) {
		refName.click();

	}
	public void selectValue(WebElement refName, String value) {
		new Select(refName).selectByValue(value);
	
	}
	public void selectIndex(WebElement refName, int index) {
		new Select(refName).selectByIndex(index);

	}
	public void selectText(WebElement refName, String text) {
		new Select(refName).selectByVisibleText(text);

	}
	public String getDataFromExcel(String SheetName, int row, int cellNo) throws IOException {
		File f = new File("G:\\datadriven\\bala.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook Workbook = new XSSFWorkbook(stream);
		Sheet sheet = Workbook.getSheet(SheetName);
		Row row2 = sheet.getRow(row);
		String value = null;
		Cell cell = row2.getCell(cellNo);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new  SimpleDateFormat("DD:MM:YYYY");
				value = format.format(dateCellValue);
				
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);

			}
		default:
			System.out.println("invalid Data");
			break;
		}
		return value;

	}
	public static Properties getDataFromProperty() throws IOException {
		File f = new File(
				"C:\\Users\\Lenovo - Ideabad\\eclipse-workspace\\MavenProject\\src\\test\\resources\\config.properties");

	FileReader filereader = new FileReader(f);
	Properties properties = new Properties();
	
	properties.load(filereader);
	
	return properties;
	
		
	}
	public static String getKeyFromPro(String key) throws IOException {
		String string = getDataFromProperty().get(key).toString();
		return string;
	}
	public static WebDriver getDriverChrome(String browser) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
}
