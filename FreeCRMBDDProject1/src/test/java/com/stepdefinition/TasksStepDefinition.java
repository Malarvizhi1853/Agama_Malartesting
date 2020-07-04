package com.stepdefinition;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.LoginPage;
import com.pages.TasksPage;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TasksStepDefinition extends Library{
	LoginPage login;
	TasksPage Tasks;
	SeleniumUtility seleniumutility;

	@Given("^user is on free crm login page$")
	public void user_is_on_free_crm_login_page() throws IOException {
		launchApplication(); 
	}
	@When("^user enters email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_email_and_password(String arg1, String arg2) {
		login= new LoginPage(driver);
		login.enterEmail(arg1);
	    login.enterPassword(arg2);
	
	}
	
	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		login= new LoginPage(driver);
		login.clickLogin();
	}

	@Then("^click navigate to task page$")
	public void click_navigate_to_task_page() {

		Tasks= new TasksPage(driver);
		Tasks.Clicktask();
	}

	@Then("^click add new task$")
	public void click_add_new_task(){
		Tasks= new TasksPage(driver);
		Tasks.Clicknewbutton();
	}

	@Then("^enter details \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_details_and(String arg1, String arg2) {
		Tasks.enterTitle(arg1);
		Tasks.enterDescription(arg2);
	    
	}
		
	@Then("^add \"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_and(String arg1, String arg2) {
		Tasks.selectType(arg1);
	
		
	}

		@Then("^save task$")
	public void save_task() {
	}

	@Then("^take Screenshot$")
	public void take_Screenshot() {
	seleniumutility= new SeleniumUtility(driver);
	seleniumutility.to_take_screenshot("src/test/resources/Screenshots/taskpage.png");
	seleniumutility.getTitle();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.close();    
	}

}
