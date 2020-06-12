package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.library;

public class OrangeHRMLogin extends library{
	com.baseclass.library example =new com.baseclass.library();
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	
	@FindBy(id="btnLogin")
	WebElement Login;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Admin;
	
	
	public OrangeHRMLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
	 public void EnteruserName(String uName) {
  	   userName.sendKeys(uName);
     }
     public void Enterpassword(String pass) {
  	   password.sendKeys(pass);
     }
     
     public void Loginbutton() {
  	   Login.click();
  
  }

    public void adminbutton() {
    	   Admin.click();
    
}
}
