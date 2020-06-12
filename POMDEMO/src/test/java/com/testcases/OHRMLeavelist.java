package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.OrangeHRMAdmin;
import com.Pages.OrangeHRMAssignLeave;
import com.Pages.OrangeHRMLeavelist;
import com.Pages.OrangeHRMLogin;
import com.baseclass.library;
import com.resusablefunctions.Seleniumutility;

public class OHRMLeavelist extends library{
	OrangeHRMAdmin OHadmin;
	OrangeHRMLeavelist OHLL;

	Seleniumutility utility;
	OrangeHRMAssignLeave OHAssignLeave;

	@BeforeClass
	public void setup() throws IOException {
		launchApplicationOHRM();

	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {
		OHAssignLeave = new OrangeHRMAssignLeave(driver);
		OHAssignLeave.EnteruserName("Admin");
		Thread.sleep(1000);
		OHAssignLeave.Enterpassword("admin123");
		Thread.sleep(1000);
		OHAssignLeave.Loginbutton();
		Thread.sleep(1000);
		OHLL.ALbutton();
		Thread.sleep(1000);

	}

	@Test(priority = 2)

	public void AssignLeave() throws InterruptedException {

		utility = new Seleniumutility(driver);
		utility.datePicker("//*[@id=\"leaveList[calFromDate]\"]");
		utility.datePicker("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a");
		Thread.sleep(5000);
		utility.datePicker("//*[@id=\"assignleave_txtToDate\"]");
		utility.datePicker("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a");
		Thread.sleep(1000);
		OHAssignLeave.CommentBox("AssignLeave Test case is approved");

	}

	@AfterClass
	public void teardown() {
		utility = new Seleniumutility(driver);
		utility.to_take_screenshot("src/test/resources/ScreenShots/assignleave.png");
		utility.getTitle();
		quit();
	}	
	
	
	
	public void testCaseToCheck() {
		
		WebElement checkBoxElement=driver.findElement(By.id("persist_box"));
		//Wait for the checkbox element to be visible
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(checkBoxElement));
		Select_The_Checkbox(checkBoxElement);
		
	}