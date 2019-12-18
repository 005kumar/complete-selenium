package demoWebDrivermethods;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Navigate {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		
		driver.navigate().to("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("Google home page");
		Thread.sleep(3000);

		driver.navigate().to("http://myrepository.com/");
		Assert.assertEquals(driver.getTitle(), "Repository");
		System.out.println("Repository home page");
		Thread.sleep(3000);

		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("Google home page");
		Thread.sleep(3000);

		driver.navigate().forward();
		Assert.assertEquals(driver.getTitle(), "Repository");
		System.out.println("Repository home page");
		Thread.sleep(3000);

		driver.navigate().refresh();
		System.out.println("Page refereshed");

	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
