package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class paramertizewithdataprovider {
	WebDriver driver;
	@Test(dataProvider="facebooklogin")
	public void loginToFacebook(String username,String password) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\krant\\Downloads\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();       
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
	Assert.assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	System.out.println("User is able to login sucessfully");
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

	@DataProvider(name="facebooklogin")
	public Object[][] passData() {

	Object[][] data=new Object[3][2];
	 //username
	data[0][0]="frank";
			//password
			data[0][1]="demo1";

			data[1][0]="Malar";
			data[1][1]="demo123";

			data[2][0]="VK";
			data[2][1]="demo1234";

			return data;
		}

	}