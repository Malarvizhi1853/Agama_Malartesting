package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class LoginPage extends Library{

	private WebDriver driver;

    // objects
    @FindBy(name = "email")
    private WebElement emailId;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div/div[1]/a")
    private WebElement forgotPassword;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;

        // initializing the page objects
        PageFactory.initElements(driver, this);
    }

    // Methods for Login page
    public String getPageTitle()
    {
        return driver.getTitle();
    }

    public void enterEmail(String email)
    {
        emailId.sendKeys(email);
       
    }

    public void enterPassword(String pwd)
    {
        password.sendKeys(pwd);
        
    }

    public void enterCredentials(String email, String pwd)
    {
        emailId.sendKeys(email);
        password.sendKeys(pwd);

       
    }

    public void clickLogin()
    {
        login.click();
       
    }
}

