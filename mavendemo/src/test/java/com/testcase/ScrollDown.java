package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {

	@Test
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.redbus.in/");
		//js.executeScript("window.scrollBy(0,4000)");
		WebElement a=driver.findElement(By.xpath("//*[@id='our_distribution_div']/div/ul/li[2]/span[1]/span"));
		//WebElement a=driver.findElement(By.xpath("//*[@id='our_distribution_div']/div/ul/li[4]/span[1]/span"));
		js.executeScript("arguments[0].scrollIntoView();", a);
		
		

	
	}
}