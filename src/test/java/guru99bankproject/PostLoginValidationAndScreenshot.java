package guru99bankproject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PostLoginValidationAndScreenshot {

	public static void main(String[] args) throws IOException {
		
        WebDriverManager.firefoxdriver().setup(); 
		
		WebDriver driver=new FirefoxDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		
	    // Login
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr554036"); // Valid User ID
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vubAbet"); // Valid Password
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click(); // click login
		
		
		// Post login message validation ==>  verify that "manager id" is shown
		
		 WebElement mgr= driver.findElement(By.xpath("//td[normalize-space()='Manger Id : mngr554036']"));
		  
		 // Approach 1
		 
		// System.out.println(mgr.getText());
		 
		 // Approach 2
		 
		 String MgrID =mgr.getText();
		 
		 if(MgrID.equals("Manager Id"))
		 {
			 System.out.println("Test passed");
		 }
		 else
		 {
			 System.out.println("Test failed");
		 }
		 
		 
		 // Take the screenshot of the output ==> manager Id
		 
WebElement mgr1= driver.findElement(By.xpath("//body/div[3]/div[1]")); // locate element

File scrnshot= mgr1.getScreenshotAs(OutputType.FILE); // capture screenshot
		
File trg3= new File("C:\\Users\\user\\Dropbox\\PC\\Documents\\Eclipse Workspace Folder\\Webdrivermavenproject\\Screenshot1\\mgr1.png"); // create target file
		 
FileUtils.copyFile(scrnshot, trg3); // copy the screenshot to the target file	
		 
			 

		
		

	}

}
