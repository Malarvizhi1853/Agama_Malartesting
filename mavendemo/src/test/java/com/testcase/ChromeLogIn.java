package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
   //System.setProperty("webdriver.chrome.driver", "C:/Users/krant/Downloads/Selenium Java/chromedriver_win32/chromedriver.exe");
	
		

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
		
		System.out.println("Title of the page is  "+ driver.getTitle());
		//driver.close();
		
	
	}

}


