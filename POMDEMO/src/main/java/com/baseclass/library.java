package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class library {
	protected WebDriver driver;
	public static Properties prop;	
	
	public void launchApplication() throws IOException {
		

	
		FileInputStream file=new FileInputStream("src/test/resources/Configuration/config.properties");
		prop=new Properties();
		prop.load(file);
	
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");

		


		try {
			if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
				
			}else if(browser.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\krant\\Downloads\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
				 
				driver=new ChromeDriver();
				  
			}
			
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		
	}catch(WebDriverException e) {
		System.out.println("browser could not be launched");
	}
		
	}
	
	
	public void launchApplicationOHRM() throws IOException {
		
		FileInputStream file=new FileInputStream("src/test/resources/Configuration/config.properties");
		prop=new Properties();
		prop.load(file);
	
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");

		try {
			if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
				
			}else if(browser.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\krant\\Downloads\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
				 
				driver=new ChromeDriver();
				  
			}
			
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		
	}catch(WebDriverException e) {
		System.out.println("browser could not be launched");
	}
		
	}
	
	
	
		

		public void quit() {
			driver.close();
			
		}




}
