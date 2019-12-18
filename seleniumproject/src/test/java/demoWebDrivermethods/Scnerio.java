package demoWebDrivermethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Scnerio {
	WebDriver driver;
	@Test
	public void f() {
		driver.get("https://en.wikipedia.org/wiki/Main_Page");

		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium (software)");
		driver.findElement(By.xpath("//input[@id='searchButton']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create account')]")).click();
		Assert.assertEquals(driver.getTitle(), "Create account - Wikipedia");
		//System.out.println(driver.getTitle());

		String url = driver.getCurrentUrl();
		System.out.println("Current url : "  +url);

		if (url.contains("wikipedia.org")) {
			System.out.println("Internal link");
		}
		else {
			System.out.println("External link");
		}

		driver.navigate().back();

		driver.findElement(By.xpath("//body[@class='mediawiki ltr sitedir-ltr mw-hide-empty-elt ns-0 ns-subject mw-editable page-Selenium_software rootpage-Selenium_software skin-vector action-view']/div[@id='content']/div[@id='bodyContent']/div[@id='mw-content-text']/div[@class='mw-parser-output']/table[@class='infobox vevent']/tbody/tr/td/span[@class='url']/a[1]")).click();
		//Assert.assertEquals(driver.getTitle(), "Selenium (software) - Wikipedia");
		Assert.assertEquals(driver.getTitle(), "SeleniumHQ Browser Automation");
		String url2 = driver.getCurrentUrl();
		System.out.println("Current URL : "+url2);

		if (url2.contains("wikipedia.org")) {
			System.out.println("Internal link");
		}
		else {
			System.out.println("External link");
		}

		
		
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
