package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	
	@Test
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
}
}