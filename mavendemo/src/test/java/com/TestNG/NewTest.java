package com.TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.WrapperMethods;

public class NewTest {
WebDriver driver;
	  WrapperMethods wm = new WrapperMethods();	
  
	@BeforeTest
	  public void chrome_browser() {
			wm.chrome_browser("https://opensource-demo.orangehrmlive.com/");
		}
	
	public void gitdemo() {
		
	}
	
	
	
	@Test(priority=1)
	public void enterbyid() {
	
		wm.enterbyid("txtUsername", "Admin");
		wm.enterbyid("txtPassword", "admin123");
		wm.clickbyxpath("//*[@id=\"btnLogin\"]");
	
	}
  
	@Test(priority=2)
	public void admin()
	{
	
		//using xpath  with contains for ADMIN 
		wm.clickbyxpath("//*[@id=\'menu_admin_viewAdminModule\']");

		//using xpath for UserMangament under admin
		wm.clickbyxpath("//*[@id=\'menu_admin_UserManagement\']");

		//using xpath for username under Usermanagement in ADMIN
		wm.enterbyid("searchSystemUser_userName", "thomas.fleming");
		
		
		//click on the search button to search a record
		wm.clickbyxpath("//input[@id='searchBtn']");
		}
	
	
	//@AfterTest
	public void closeapp() 
	{
			wm.closeapp();
	
	}
}
	


