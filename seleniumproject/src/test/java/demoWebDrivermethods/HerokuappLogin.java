package demoWebDrivermethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HerokuappLogin {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		Thread.sleep(3000);


	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();


	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
