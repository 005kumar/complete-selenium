package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demosoftassert {
	@Test
	public void test1() {
		System.out.println("Test 1 started");

		SoftAssert sa =new SoftAssert();

		System.out.println("Checking first condition");
		sa.assertEquals("Hello", "Hi");

		System.out.println("Checking second condition");
		sa.assertNotEquals(10,10,"Error message:  both are equal");

		System.out.println("Test 1 completed");
		sa.assertAll();
	}
}
