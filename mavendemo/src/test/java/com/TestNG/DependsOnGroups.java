package com.TestNG;

import org.testng.annotations.Test;

public class DependsOnGroups {

	@Test(groups= {"smoketesting", "sanitytesting"})
	public void login(){
		System.out.println("login");
		}

	@Test(groups= {"smoketesting", "regressiontesting"})
	public void search(){
		System.out.println("search");
		System.out.println("some");
		//Assert.assertEquals("XYZ", "abc");
		}
	


	@Test(groups= {"regressiontesting", "retesting"})
	public void logout(){
		System.out.println("logout");
		}
}
