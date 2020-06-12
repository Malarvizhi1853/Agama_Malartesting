package com.testcase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestcase {


	@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
		}
		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
		}
		@Before
		public  void beforeMethod()  {
		System.out.println("before");
		}
		@After
		public  void afterMethod()  {
		System.out.println("after");
		}
		@Test
		public void test() {
		System.out.println("test1");
		}
		@Test
		public void test2() {
		System.out.println("test2");
		}
		@Test
		public void test3() {
		System.out.println("test3");
		}
		@Test
		public void test4() {
		System.out.println("test4");
		}
}
