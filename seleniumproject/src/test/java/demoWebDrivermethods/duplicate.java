package demoWebDrivermethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class duplicate {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {

		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium (software)");
		driver.findElement(By.xpath("//input[@id='searchButton']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create account')]")).click();
		String url = driver.getCurrentUrl();

		Assert.assertTrue(url.contains("wikipedia.org"), "External Link");

		//System.out.println("URL is: "+url);

		/* if (url.contains("wikipedia.org")) {
			System.out.println("Internal link");
		}
		else {
			System.out.println("External link");
		} */

		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath("//body[@class='mediawiki ltr sitedir-ltr mw-hide-empty-elt ns-0 ns-subject mw-editable page-Selenium_software rootpage-Selenium_software skin-vector action-view']/div[@id='content']/div[@id='bodyContent']/div[@id='mw-content-text']/div[@class='mw-parser-output']/table[@class='infobox vevent']/tbody/tr/td/span[@class='url']/a[1]")).click();
		String newurl = driver.getCurrentUrl();

		Assert.assertFalse(newurl.contains("wikipedia.org"), "External link");
		/* if (newurl.contains("wikipedia.org")) {
			System.out.println("Internal link");
		}
		else {
			System.out.println("External link");
		} */ 

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
		driver.close();
	}

}
