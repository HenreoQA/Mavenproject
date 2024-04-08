package testng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdTest {
	
	WebDriver driver;
	
	@Test(priority=1)
	void openApp()
	{
		WebDriverManager.firefoxdriver().setup(); 
		
	    driver=new FirefoxDriver();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
	}
	
	
    // Login
	
	 @Test(priority=2)
	void login()
	{
	
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr554036"); // Valid User ID
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vubAbet"); // Valid Password
	
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click(); // click login
	
	}
	 
	 
	
	// Post login message validation ==>  verify that "manager id" is shown
	
	  @Test(priority=3, dependsOnMethods= {"login"})
	 void postlogin()
 {
	 WebElement mgr= driver.findElement(By.xpath("//td[normalize-space()='Manger Id : mngr554036']"));
	  
/*	 String MgrID =mgr.getText();
	 
	 if(MgrID.equals("Manager Id"))
	 {
		 System.out.println("Test passed");
	 }
	 else
	 {
		 System.out.println("Test failed");
	 }
	 */
	 
	 String s1=mgr.getText();
	 
	 String s2= "Manager Id";
	 
	 Assert.assertEquals(s1, s2);
	 
	 
 }
	 
	 // Take the screenshot of the output ==> manager Id
	  
	  @Test(priority=4)
	  void screenshot() throws IOException
{
	 
WebElement mgr1= driver.findElement(By.xpath("//body/div[3]/div[1]")); // locate element

File scrnshot= mgr1.getScreenshotAs(OutputType.FILE); // capture screenshot
	
File trg3= new File("C:\\Users\\user\\Dropbox\\PC\\Documents\\Eclipse Workspace Folder\\Webdrivermavenproject\\Screenshot1\\mgr1.png"); // create target file
	 
FileUtils.copyFile(scrnshot, trg3); // copy the screenshot to the target file	
}	 
		
	  
	  @Test(priority=5) 
	  void closeApp()
	  {
		  driver.close();
	  }

	
	
	
	
	
	
	
	
	
	
	

}
