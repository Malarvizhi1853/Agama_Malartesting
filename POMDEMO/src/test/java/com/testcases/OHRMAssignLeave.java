package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.OrangeHRMAdmin;
import com.Pages.OrangeHRMAssignLeave;
import com.Pages.OrangeHRMLogin;
import com.baseclass.library;
import com.resusablefunctions.Seleniumutility;

public class OHRMAssignLeave extends library {
	OrangeHRMLogin OHLogin;
	OrangeHRMAdmin OHadmin;
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
		OHAssignLeave.ALbutton();
		Thread.sleep(1000);

	}

	@Test(priority = 2)

	public void AssignLeave() throws InterruptedException {

		OHAssignLeave.EmployeeName("Jasmine Morgan");
		OHAssignLeave.LeaveType();
		utility = new Seleniumutility(driver);
		utility.datePicker("//*[@id=\"assignleave_txtFromDate\"]");
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
}
