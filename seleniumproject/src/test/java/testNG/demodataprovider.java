package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class demodataprovider {
	@Test(dataProvider = "credentials")
	public void f(String username, String password) {
		System.out.println("Username is: "+username);
		System.out.println("Password is: "+password);
	}
	@DataProvider(name="credentials")
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "lalitha", "password123" },
			new Object[] { "niki", "dude" },
			new Object[] { "Pratik", "rana" },
		};
	}
}
