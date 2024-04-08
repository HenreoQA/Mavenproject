package dataprovidertestng;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }
	
	@Test(dataProvider = "dp") // specify the dataprovider name for the test method to know the dataprovider that is passing the data or parameter
	void login(String username, String pswd) // pass the parameters - username and password
	{
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pswd); 
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	//driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	  
  
	 
	}


  @DataProvider(name="dp")
 // @DataProvider(name="dp", indices = {0,3}) // if you want to execute the first and last statements
  String[][] loginData()
  {
	  String data[][] = {
			        
			            //  {"Admin", "admin123"},
			              {"member", "member123"},
			              {"henry", "member234"},
			              {"henry3", "henry235"}
			              
			          
			            };
	  return data;
  
  }


}
