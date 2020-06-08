package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardHandling {

	@Test
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	Actions action=new Actions(driver);
	action.sendKeys(Keys.TAB).perform();
	action.sendKeys("abcd").perform();
	action.sendKeys(Keys.ENTER).perform();
	
}
}
