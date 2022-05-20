package org.basic;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestngProperties extends BaseClassMethods{

	public static void main(String[] args) throws IOException {
		BaseClassMethods b = new BaseClassMethods();

		String browser = getKeyFromPro("browser");
		getDriverChrome(browser);	
		String url = getKeyFromPro("url");
		launch("https://www.facebook.com/");
		String username = getKeyFromPro("username");
		WebElement idvalue = idValue("email");
		textSend(idvalue, username);




	}

}
