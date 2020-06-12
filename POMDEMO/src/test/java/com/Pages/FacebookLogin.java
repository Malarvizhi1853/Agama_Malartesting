package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.library;

public class FacebookLogin extends library{
	
	com.baseclass.library example = new com.baseclass.library();
	
	
	WebDriver driver;

	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(id="pass")
	WebElement password;
	
	
	@FindBy(xpath="//*[@id='u_0_b']")
	WebElement submit;
	
	public FacebookLogin(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
       public void EnteruserName(String uName) {
    	   userName.sendKeys(uName);
       }
       public void Enterpassword(String pass) {
    	   password.sendKeys(pass);
       }
       
       public void submitbutton() {
    	   submit.click();

}
}


