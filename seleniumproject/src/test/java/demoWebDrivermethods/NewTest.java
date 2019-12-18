package demoWebDrivermethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;
	@Test
	public void f() {
		driver.get("https://en.wikipedia.org/wiki/Main_Page");

		Assert.assertEquals(driver.getTitle(), "Wikipedia, the free encyclopedia");
		driver.findElement(By.linkText("History")).click();
		Assert.assertEquals(driver.getTitle(), "Portal:History");
		String url = driver.getCurrentUrl();
		System.out.println("URL is : " +url);
		System.out.println(driver.getPageSource());
		//driver.close(); after test

	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
