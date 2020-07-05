package com.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/taskpage.feature", plugin = { "pretty",
		"html:reports/cucumber-html-report", "json:reports/cucumber-html-report/jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html" }, glue = {
				"com.stepdefinition" },
dryRun = false, //To check the mapping is proper between feature file and stepdefinition(true=without browser, false= open the browser)
strict = true) // It will check if any step is not defined in step definition file
public class TestRunnerCRM {
	@AfterClass
	public static void extendReport() {
		// Reporter.loadXMLConfig("src/test/resources/TestData/extent-config.xml");
		// Reporter.setSystemInfo("user", System.getProperty("user.name"));
		// Reporter.setSystemInfo("os", "Windows");
		// Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
