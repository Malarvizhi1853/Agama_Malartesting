package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	@Test
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[2]")).click();
	
}
}
