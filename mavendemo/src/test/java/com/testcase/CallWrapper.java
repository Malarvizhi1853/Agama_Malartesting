package com.testcase;

import java.io.IOException;

import commonMethods.WrapperMethods;

public class CallWrapper {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub

		
				WrapperMethods wm = new WrapperMethods();
				wm.chrome_browser("https://opensource-demo.orangehrmlive.com/");
				wm.enterbyid("txtUsername", "Admin");
				wm.enterbyid("txtPassword", "admin123");
				wm.clickbyxpath("//*[@id=\"btnLogin\"]");
			
				
				wm.clickbyxpath("//a[@id='menu_pim_viewPimModule']");
				wm.clickbyxpath("//input[@id='btnAdd']");
		        Thread.sleep(1000);
		        System.out.println("After clicking the add button ");
				wm.clickbyxpath("//a[@id='menu_pim_addEmployee']");
			
										
				wm.enterbyid("firstName", "Malar1");
				wm.enterbyid("middleName", "V1");
				wm.enterbyid("lastName", "Kannan1");
				
				wm.FileUpload("photofile", "C:\\Malar\\Java\\orange5.png");
				wm.clickbyxpath("//*[@id=\"btnSave\"]");
				wm.takesnap("C:\\Malar\\Java\\orange6.png");
			}

		}

