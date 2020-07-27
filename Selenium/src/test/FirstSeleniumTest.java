package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {


	public static void main(String[] args) {
		

//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shivi\\eclipse-workspace\\Selenium\\lib\\geckodriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	
	//	System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://myntra.com/");
		
	driver.quit();
	}
}
