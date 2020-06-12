package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {

	@Test
public void login() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	driver.findElement(By.id("src")).sendKeys("CHE");
	Thread.sleep(1000);
	WebElement a=driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[4]"));
	//WebElement b=driver.findElement(By.id("menu_admin_employmentStatus"));
	Actions action=new Actions(driver);
	action.moveToElement(a).click().build().perform();
	

	
//	public void login() {
		
	//	WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
	//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//driver.findElement(By.id("btnLogin")).click();
	//driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	//WebElement a=driver.findElement(By.id("menu_admin_Job"));
	//WebElement b=driver.findElement(By.id("menu_admin_employmentStatus"));
	//Actions action=new Actions(driver);
	//action.moveToElement(a).perform();
	//action.moveToElement(b).click().build().perform();
	}

	
	
}
