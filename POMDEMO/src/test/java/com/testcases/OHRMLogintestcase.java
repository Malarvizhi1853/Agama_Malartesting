package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.FacebookLogin;
import com.Pages.OrangeHRMLogin;
import com.baseclass.library;
import com.resusablefunctions.Seleniumutility;

public class OHRMLogintestcase extends library{
	
	OrangeHRMLogin OHRM;
	Seleniumutility utility;
	
	@BeforeClass
	public void setup() throws IOException {
		launchApplicationOHRM();
		
	}

	@Test
	public void Login() {
	
		OHRM= new OrangeHRMLogin(driver);
		OHRM.EnteruserName("Admin");
		OHRM.Enterpassword("admin123");
		OHRM.Loginbutton();
		OHRM.adminbutton();
	}
	
	
		@AfterClass
		public void teardown(){
			utility= new Seleniumutility(driver);
			utility.to_take_screenshot("src/test/resources/ScreenShots/orangelogin.png");
			utility.getTitle();
			quit();
		}

		
		
	}