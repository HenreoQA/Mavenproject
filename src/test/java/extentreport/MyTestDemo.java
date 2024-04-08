package extentreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 // @Listeners(extentreport.MyExtentReportListenerManager.class)

public class MyTestDemo {
	

    WebDriver driver;
	
	@BeforeClass
	
	void setup()
	{
		
		{
			driver=new ChromeDriver();
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
	  
	  Assert.assertTrue(false);
	}
	
	@Test(priority=2, dependsOnMethods = {"login"})
	void HomepageTitle()
	{
	  String Actual_Title = driver .getTitle();	
	  String Expected_Title = "OrangeHRM";
	  Assert.assertEquals(Actual_Title, Expected_Title);
	 
	}
	
	@Test(priority=3)
	void logout()
	{
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}
	
	@AfterClass
	void ClossApp()
	{
		driver.quit();
	}
	
	
	

}
