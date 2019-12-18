package demoWebDrivermethods;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.Driver;
import java.sql.DriverAction;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CS3registration {
	WebDriver driver;
	@Test(priority=1)
	public void f() throws InterruptedException {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		/*	driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		String userinput;
		String str;
		do 
		{	
			userinput = JOptionPane.showInputDialog("Enter username");
			driver.findElement(By.xpath("//input[@id='userName']")).click();
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(userinput);
			driver.findElement(By.xpath("//input[@id='firstName']")).click();
			Thread.sleep(3000);
			str = driver.findElement(By.xpath("//span[@id='err']")).getText();
			System.out.println("str");

		}while(str.equalsIgnoreCase("Name Already Exists"));


		//driver.findElement(By.xpath("//input[@id='userName']")).click();
		//driver.switchTo().defaultContent();
		//idriver.findElement(By.xpath("//input[@id='userName']")).sendKeys(userinput);
		driver.findElement(By.xpath("//input[@id='firstName']")).click();


		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("bhupendra");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kumar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kumar12345");
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("kumar12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='form-control input-lg']//input[1]")).click();
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("bk@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9632587410");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("01/01/2000");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("pune, hinjewadi, maharastra");
		driver.findElement(By.xpath("//select[@id='securityQuestion']")).click();
		driver.findElement(By.xpath("//select[@id='securityQuestion']")).click();
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("Rewa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(5000);

		 */
	}


	@Test(priority=1)
	public void f1() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("lalitha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(5000);

	}

	@Test(priority=2)
	public void f2() throws InterruptedException  {

		driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.xpath("//h4[@class='nomargin']")).getText(), "Headphone");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[2]//input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]//i")).click();
		driver.findElement(By.xpath("//a[@id='btn']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//div[3]//input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='transpwd']")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//div[@class='user-right']//input")).click();



	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
