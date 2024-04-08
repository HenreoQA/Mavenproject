package pageobjectmodel;

// Using page factory approach to create page object class


import java.util.List;

//Using page factory approach to create page object class

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUsingPageFactory 
{
public WebDriver driver;
	
	// Constructor --- create the constructor to initiate the driver
	
	LoginPageUsingPageFactory(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this); // The driver will be assigned to the webelements
	}
	
	// Webelements -- capture the webelements
	
	@FindBy(xpath="//img[@alt='company-branding']") WebElement img_logo; // logo
	@FindBy(name="username") WebElement txt_username; // username
	@FindBy(css="input[placeholder='Password']") WebElement txt_pswd; // password
	@FindBy(xpath="//button[@type='submit']") WebElement btn_submit; // submit
	
//	@FindBy(tagName="a") List<WebElement> links; // for multiple elements
	
	// Action methods
	
	public void Setusername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void Setpassword(String password)
	{
		txt_pswd.sendKeys(password);
	}
	
	public void Clicksubmit()
	{
		btn_submit.click();
	}
	
	public boolean Checklogo()
	{
		boolean status= img_logo.isDisplayed();
		
		return status;
	}
	
	
	
	
	
	

	
	

	
	
	
	
	
	
	
	
	
}
