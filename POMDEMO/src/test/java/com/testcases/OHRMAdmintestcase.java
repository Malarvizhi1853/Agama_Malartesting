package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.OrangeHRMAdmin;
import com.Pages.OrangeHRMLogin;
import com.baseclass.library;
import com.resusablefunctions.Seleniumutility;

public class OHRMAdmintestcase extends library{
	OrangeHRMLogin OHLogin;
	OrangeHRMAdmin OHadmin;
	Seleniumutility utility;
	
	@BeforeClass
	public void setup() throws IOException{
		launchApplicationOHRM();
		
	}
	@Test(priority=1)
	public void Login() throws InterruptedException{
		OHLogin = new OrangeHRMLogin(driver);
		OHLogin.EnteruserName("Admin");
		Thread.sleep(1000);
		OHLogin.Enterpassword("admin123");
		Thread.sleep(1000);
		OHLogin.Loginbutton();
		Thread.sleep(1000);
		OHLogin.adminbutton();
		Thread.sleep(1000);
	}
	@Test(priority=2)
	public void Admin() throws InterruptedException{
		
		OHadmin = new OrangeHRMAdmin(driver);
		OHadmin.Entername("Malarvizhi");
		Thread.sleep(1000);
		OHadmin.userRole();
		Thread.sleep(1000);
		OHadmin.Empname("Malar");
		Thread.sleep(1000);
		OHadmin.userStatus();
		Thread.sleep(1000);
		OHadmin.searchButton();
		
	}
	@AfterClass
	public void teardown(){
		utility= new Seleniumutility(driver);
		utility.to_take_screenshot("src/test/resources/ScreenShots/adminlogin.png");
		utility.getTitle();
		quit();
	}
}
