package com.testcase;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HtmlUnitDriver driver = new HtmlUnitDriver();
				driver.get("https://www.google.com");
		System.out.println("Title of the page is  "+ driver.getTitle());
	}
}
