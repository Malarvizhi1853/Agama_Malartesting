package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.reusablefunctions.SeleniumUtility;

public class TasksPage{
	
    WebDriver driver;
    SeleniumUtility utility = new SeleniumUtility(driver);

    @FindBy(xpath= "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
    WebElement Title;
    
    @FindBy(xpath= "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")
    WebElement AssignedTo;
 

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[1]/div/input")
    WebElement Duedate;

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/div[1]/div/input")
    WebElement Closedate;

    @FindBy(name = "description")
    WebElement Description;

    @FindBy(name = "type")
    WebElement Type;

    @FindBy(name = "priority")
    WebElement Priority;
    
    @FindBy(xpath = "//*[@id=\"main-nav\"]/a[6]/span")
    WebElement ClickTask;
    
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/a/button")
    WebElement ClickNew;
       
    @FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
    WebElement save;
    
    public void Clicktask(){
		ClickTask.click();
			
	}
	public void Clicknewbutton(){
		ClickNew.click();
			
	}
    

    public TasksPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTitle(String title)
    {
        Title.sendKeys(title);
    }
    
    public void Assignedto(){
		Select selectText=new Select(AssignedTo);
	     selectText.selectByVisibleText("Malarvizhi Anbazhagan");
	}

    public void setDueDate(String date)
    {
        Duedate.click();
        driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div[2]/div/div/button[2]")).click();
    }
    
    public void setCloseDate(String date)
    {
        Closedate.click();
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[4]")).click();
                    }
    
     public void Priority()
    {
		Select selectText=new Select(Priority);
	     selectText.selectByVisibleText("High");
	}

    public void enterDescription(String description)
    {
        Description.sendKeys(description);
    }

    public void selectType(String type)
    {
        Type.click();
        WebElement typeDropdown = driver.findElement(By.xpath(".//*[@name='type']/div/div[@role='option']/span[contains(text(),'" + type + "')]"));
        typeDropdown.click();
    }
    
  
    public void clickSave()
    {
        save.click();
    }

}