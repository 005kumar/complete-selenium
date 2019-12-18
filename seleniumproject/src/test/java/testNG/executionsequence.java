package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class executionsequence {
	@Test
	public void f() {
		System.out.println("I am @Test annotation");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am @Before test annotation");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("i am @After test nnotation");
	}

}
