package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.library;

public class FacebookSignup extends library{

	com.baseclass.library example = new com.baseclass.library();
	WebDriver driver;

	@FindBy(id="u_0_m")
	WebElement Firstname;
	
	@FindBy(id="u_0_o")
	WebElement Lastname;
	
	@FindBy(name="reg_email__")
	WebElement reg_email;
	
	@FindBy(id="u_0_u")
	WebElement confirm_email;
	
	@FindBy(name="reg_passwd__")
	WebElement reg_pass;
	
	@FindBy(id="month")
	WebElement mon;
	
	@FindBy(id="day")
	WebElement day;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(id=("u_0_6"))
	WebElement radio1;
	
	@FindBy(id=("u_0_7"))
	WebElement radio2;
	
	@FindBy(id=("u_0_8"))
	WebElement radio3;

	@FindBy(id=("u_0_13"))
	WebElement Signup;


	
	public FacebookSignup(WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
}

public void Enterfirstname(String Fname) {
	Firstname.sendKeys(Fname);
}
public void Enterlastname(String Lname) {
	   Lastname.sendKeys(Lname);
}

public void regemail(String Email) {
	reg_email.sendKeys(Email);
	
}

public void confirmemail(String Email) {
	confirm_email.sendKeys(Email);
	
}

public void regpass(String pass) {
	reg_pass.sendKeys(pass);
	
}

public void selectmonth(String id, String text) throws InterruptedException {
	Select month=new Select(driver.findElement(By.id("month")));
	month.selectByVisibleText(text);
	Thread.sleep(1000);
}

public void selectday(String id, String text) throws InterruptedException {
	Select day=new Select(driver.findElement(By.id("day")));
	day.selectByVisibleText(text);
	Thread.sleep(1000);
}

public void selectyear(String id, String text) throws InterruptedException {
	Select year=new Select(driver.findElement(By.id("year")));
	year.selectByVisibleText(text);
	Thread.sleep(1000);
	
}
public void Radiobutton() throws InterruptedException{
     radio1.click();
     Thread.sleep(1000);
   }

public void Radiobutton2() throws InterruptedException{
    radio2.click();
    Thread.sleep(1000);
  }

public void Radiobutton3() throws InterruptedException{
    radio3.click();
    Thread.sleep(1000);
  }

public void signup() {
	   Signup.click();
    
  }

	}