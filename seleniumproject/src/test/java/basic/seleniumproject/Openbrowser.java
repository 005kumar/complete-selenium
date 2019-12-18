package basic.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		
		driver = new ChromeDriver(); //open chrome browser
		
		driver.get("https://selenium.dev/"); // open website
			
		driver.manage().window().maximize(); // maxmize the window
		
		Thread.sleep(3000);
		
		driver.close();  //close the browser
		
		
	}

}
