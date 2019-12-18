package demoWebDrivermethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class verification {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {

		driver.get("http://www.newtours.demoaut.com/");
		String pageTitle=driver.getTitle();
		System.out.println("Page title :" +pageTitle);
		Assert.assertEquals(pageTitle, "Welcome: Mercury Tours");

		driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.partialLinkText("GIST")).click();
		System.out.println("Register title:"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Bhupendra");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("kumar@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("110010");

		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("Kumar005");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Dude");
		driver.findElement(By.xpath("//input[contains(@name,'confirmPassword')]")).sendKeys("Dude");
		driver.findElement(By.xpath("//input[contains(@type,'image')]")).click();

		Select countryname = new Select(driver.findElement(By.name("Country")));

		countryname.selectByIndex(4);   // angola

		countryname.selectByValue("8");  //argentina
		Thread.sleep(3000);

		countryname.selectByVisibleText("INDIA");  //INDIA
		Thread.sleep(3000);
		driver.close();

	}
	@BeforeTest
	public void beforeTest() {
		//System.out.println();
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
