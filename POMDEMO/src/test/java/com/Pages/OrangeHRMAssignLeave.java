package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMAssignLeave {
	com.baseclass.library example =new com.baseclass.library();
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	
	@FindBy(id="btnLogin")
	WebElement Login;
	
	@FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img")
	WebElement Assignleave;
	
	@FindBy(name="assignleave[txtEmployee][empName]")
	WebElement empName;
	
	@FindBy(id="assignleave_txtLeaveType")
	WebElement pick;
	
	@FindBy(xpath="//*[@id=\"assignleave_txtFromDate\"]")
	WebElement fromDate;

	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")
	WebElement selectDate;
	
	@FindBy(id="assignleave_txtToDate")
	WebElement toDate;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a")
	WebElement selectEndDate;
	
	@FindBy(id="assignleave_txtComment")
	WebElement comment;


	public OrangeHRMAssignLeave(WebDriver driver) {
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

    public void ALbutton() {
    	   Assignleave.click();
    
}
    public void EmployeeName(String emplName) {
	  	   empName.sendKeys(emplName);
	  	   
	}   
    
    public void LeaveType(){
		Select selectText=new Select(pick);
	     selectText.selectByVisibleText("Vacation US");
	}
    public void CommentBox(String commenttxt) {
	  	   comment.sendKeys(commenttxt);
	  	   
	}   
 
    
}
