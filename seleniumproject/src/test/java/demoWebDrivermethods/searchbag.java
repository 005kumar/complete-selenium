package demoWebDrivermethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class searchbag {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("bag");
		
		driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]")).click();
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
		driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
		String item = driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();

		Assert.assertTrue(item.contains("bag"), "Bag not found dude");
		Thread.sleep(3000);

	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}
