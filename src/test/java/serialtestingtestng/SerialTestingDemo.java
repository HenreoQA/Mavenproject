package serialtestingtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SerialTestingDemo {

    WebDriver driver;
	
	@BeforeClass
	
	@Parameters({"browser"}) // pass the browser parameters annotation from XML
	
	void setup(String br) // br=the variable that contains the value of the browser in XML
	{
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
	}
	
	@Test(priority=1)
	void login()
	{
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
	}
	
	@Test(priority=2)
	void HomepageTitle()
	{
	  String Actual_Title = driver .getTitle();	
	  String Expected_Title = "OrangeHRM";
	  Assert.assertEquals(Actual_Title, Expected_Title);
	 
	}
	
	@AfterClass
	void ClossApp()
	{
		driver.quit();
	}
	
	
	
	

}
