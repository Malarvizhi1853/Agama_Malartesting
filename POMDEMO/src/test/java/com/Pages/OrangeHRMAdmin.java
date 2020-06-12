package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMAdmin {
	
	
WebDriver driver;
	
	@FindBy(xpath="//*[@id='searchSystemUser_userName']")
	WebElement AdminuserName;
	
	@FindBy(id="searchSystemUser_userType")
	WebElement select;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement employeeName;
	
	@FindBy(id="searchSystemUser_status")
	WebElement status;
	
	@FindBy(xpath="//*[@id='searchBtn']")
	WebElement Searchbutton;
	
	
	
	public OrangeHRMAdmin(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	public void Entername(String eName){
		AdminuserName.sendKeys(eName);
			
	}
	public void userRole(){
		Select selectText=new Select(select);
	     selectText.selectByVisibleText("Admin");
	}
	public void Empname(String emName){
		employeeName.sendKeys(emName);
			
	}
	public void userStatus(){
		Select selectText=new Select(status);
	     selectText.selectByVisibleText("Enabled");
	}
	public void searchButton(){
		Searchbutton.click();
			
	}
	

}