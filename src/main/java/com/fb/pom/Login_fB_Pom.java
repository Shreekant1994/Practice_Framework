package com.fb.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_fB_Pom {
	
	WebDriver localdriver ;
	
	public Login_fB_Pom(WebDriver driver) {
		
		localdriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (how=How.XPATH,using="//input[@name='cusid']")
	private WebElement customer_ID;

	@FindBy (how=How.XPATH,using="//input[@name='submit']")
	private WebElement submit;

	public void Setcustomer_ID() throws Exception {
		customer_ID.sendKeys("1234");
	Thread.sleep(3000);
	}
	public void Poerfom_clk() throws Exception {
		
		submit.click();
		Thread.sleep(3000);
	}
	
	
}
