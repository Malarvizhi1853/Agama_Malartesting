package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.FacebookLogin;
import com.baseclass.library;
import com.resusablefunctions.Seleniumutility;

public class Logintestcase extends library{
	
	
	FacebookLogin fb;
	Seleniumutility utility;
	
	@BeforeClass
	public void setup() throws IOException {
		launchApplication();
		
	}

	@Test
	public void Login() {
	
		fb= new FacebookLogin(driver);
		fb.EnteruserName("abcd@gmail.com");
		fb.Enterpassword("abcd");
		fb.submitbutton();
	}
	
	
	@AfterClass
	public void teardown() {
		utility = new Seleniumutility(driver);
		utility.to_take_screenshot("src/test/resources/Screenshots/facebooklogin.png");
		utility.getTitle();
	}
} 
