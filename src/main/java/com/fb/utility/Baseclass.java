package com.fb.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	WebDriver driver;
	@BeforeMethod
	
	public void setup() throws Exception {
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	
	public void Browser_Close() {
		
		driver.close();
	}
	
	
	
}
