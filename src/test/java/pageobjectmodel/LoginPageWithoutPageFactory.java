package pageobjectmodel;

// Using normal approach(without page factory) to create page object class

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPageWithoutPageFactory
{
	public WebDriver driver;
	
	// Constructor --- create the constructor to initiate the driver
	
	LoginPageWithoutPageFactory(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// Locators -- capture the locators
	
	By img_logo_loc = By.xpath("//img[@alt='company-branding']"); // logo
	By txt_username_loc = By.name("username"); // username
	By txt_pswd_loc = By.cssSelector("input[placeholder='Password']");
	By btn_login_loc = By.xpath("//button[@type='submit']"); // submit
	
	// Action methods
	
	public void Setusername(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void Setpassword(String password)
	{
		driver.findElement(txt_pswd_loc).sendKeys(password);
	}
	
	public void Clicksubmit()
	{
		driver.findElement(btn_login_loc).click();
	}
	
	public boolean Checklogo()
	{
		boolean status= driver.findElement(img_logo_loc).isDisplayed();
		
		return status;
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
