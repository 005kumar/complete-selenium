package basic.seleniumproject;

import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;


import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class demoreadexcel {
	WebDriver Driver;
	@Test(dataProvider = "credentials")
	public void f(String username, String password) throws InterruptedException {

		Driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		Driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		Driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//a[contains(text(),'SignOut')]")).click();

	}

	@DataProvider(name="credentials")
	public Object[][] dp() throws IOException {
		return MyExcelReader.ReadData(); 


	} 	



	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		Driver.close();

	}

}
