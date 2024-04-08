package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/* TO AUTOMATE TEST CASES FOR LOGIN:

1. Launch browser
2. open url on the browser --- https://opensource-demo.orangehrmlive.com/
3. provide username --- Admin
4. provide password ---  admin123
5. click on login button
6. verify the title of dashboard page --- OrangeHRM
7. close browser */

public class OrangeHRMLoginTest 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		// 1. Launch browser (Chrome) by creating the object of ChromDriver and import webdriver and ChromeDriver
		
	//	WebDriverManager.chromedriver().setup(); // This is applicable if you are using webdrivermanager (to set up webdrivermanager)
		
	//	ChromeDriver driver=new ChromeDriver(); // This variable can contain only chromedriver
		
		WebDriver driver=new ChromeDriver(); // This is preferable b/c Webdriver variable will contain all the types of browser drivers
		
	
// 2. open url on the browser using webdriver variable --- https://opensource-demo.orangehrmlive.com/
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize(); // To maximize the page
		
		Thread.sleep(5000); // the url will wait for 5 seconds after it is loaded to enable username element to load (handling of interruptedexception using throws)
		
		
		
// 3. verify username --- Admin
		
//	WebElement txtUsername=driver.findElement(By.name("username")); // find the element and store it in the variable
	
	// txtusername=username variable, driver= webdriver variable, findElement=method, (By.name("username))=locator/attribute, WebElement=type of variable or data it is returning
	
//	txtUsername.sendKeys("Admin"); // Assign the username (Admin) to the username variable using sendkeys method
		
//	driver.findElement(By.name("username")).sendKeys("Admin");
		
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	
	
	
//	4. verify password ---  admin123
	
	//driver.findElement(By.name("password")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	
	
//	5. click on login button
	 
	// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
// 6. verify the title of dashboard page --- OrangeHRM
	
	// Approach 1:
	  
	  String actual_title =  driver.getTitle();
	  
	  String expected_title="OrangeHRM";
	  
	  if (actual_title.equals(expected_title))
	  {
		  System.out.println("Test passed");
		  
	  }
	  else
	  {
		  System.out.println("failed");
	  }
	  
	  
	  // Approach 2:
	  
	 /* String actual_title =  driver.getTitle();
	  
	  System.out.println(actual_title); 
	  */
		 
	// 7. close browser
	  
	   // driver.close(); // either you use quit or close
	  //  driver.quit();
 
	}

}
