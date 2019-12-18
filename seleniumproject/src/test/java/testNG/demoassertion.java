package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demoassertion {
	@Test
	public void test1() {
		System.out.println("Test 1 started");
		Assert.assertTrue(20>18, "Error msg- 20 is greater than 18");
		System.out.println("Test 1 completed");
	}

	@Test
	public void test2() {
		// System.out.println("Test 2 started");
		Assert.assertFalse(20>18, "Error msg- 20 is greater than 18");
		//System.out.println("Test 2 completed");
	} 
	@Test
	public void test3() {
		Assert.assertFalse("Salenium".contains("ba"));
	}
	@Test
	public void test4() {
		Assert.assertEquals("Hello", "Hi");
	}
	@Test
	public void test5() {
		Assert.assertNotEquals("Hello","Hi");
	}
	@Test
	public void test6() {
		Object test = null;
		Assert.assertNull(test);
	}
	@Test
	public void test7() {
		Object test = null;
		Assert.assertNotNull(test);
	}
	@Test
	public void test8() {
		Assert.fail("Intentionally failing the condition");
	}


} 



