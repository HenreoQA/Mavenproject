package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {

     WebDriver driver; // declare global variable
	
   //  @BeforeClass
     
	@Test(priority=1)
	void openApp()
	{
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
		
		
	}
	
	@Test(priority=2)
	void login()
	{
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	
	// @AfterClass
	
	@Test(priority=3)
	void closeApp()
	{
		driver.close();
	}
	
	
	
	
	
	
}
