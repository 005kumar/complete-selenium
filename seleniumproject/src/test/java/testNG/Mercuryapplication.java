package testNG;

import org.testng.annotations.Test;

public class Mercuryapplication {
	@Test(priority=1)
	public void openBrowser() {
		System.out.println("Its Openbrowser");
	}
	@Test(priority=2)
	public void openURL() {
		System.out.println("Its OpenURL");
	}
	@Test(priority=3)
	public void Login() {
		System.out.println("Its Login");
	}
	@Test(priority=4)
	public void searchFlight() {
		System.out.println("Its searchFlight");
	}
	@Test(priority=5)
	public void bookFlight() {
		System.out.println("Its bookFlight");
	}
	@Test(priority=6,enabled=false)
	public void logout() {
		System.out.println("Its Logout");
	}
	@Test(priority=7)
	public void closeBrowser() {
		System.out.println("Its closebrowser");
	}



}
