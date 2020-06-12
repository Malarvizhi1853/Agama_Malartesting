package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.FacebookSignup;
import com.baseclass.library;
import com.resusablefunctions.Seleniumutility;

public class Signuptestcase extends library{
	
		FacebookSignup fb;
		Seleniumutility utility;
		
		@BeforeClass
		public void setup() throws IOException {
			launchApplication();
			
		}
		@Test
		public void Signup() throws InterruptedException {
		
			fb= new FacebookSignup(driver);
			fb.Enterfirstname("Malarvizhi");
			fb.Enterlastname("Anbazhagan");
			fb.regemail("abcd@gmail.com");
			fb.confirmemail("abcd@gmail.com");
			fb.regpass("abcdef");
			fb.selectmonth("month", "Sep");
			fb.selectday("day", "23");
			fb.selectyear("year", "1983");
			fb.Radiobutton();
			fb.signup();
			
		}

@AfterClass
public void teardown() {
	utility = new Seleniumutility(driver);
	utility.to_take_screenshot("src/test/resources/Screenshots/facebookSignup.png");
	utility.getTitle();
}
} 

