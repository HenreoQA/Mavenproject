package guru99bankproject;

import java.time.Duration;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAndHomePageTitleValidation {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup(); 
		
		WebDriver driver=new FirefoxDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		
	    // Login validation with valid user Id and valid password
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr554036"); // Valid User ID
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vubAbet"); // Valid Password
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click(); // click login
		
		// Homepage title validation
		
		// Approach1

		  String actual_title = driver.getTitle();
		  
		  String expected_title="Guru99 Bank Manager HomePage";
		  
		  if (actual_title.equals(expected_title))
		  {
			  System.out.println("Test passed");
			  
		  }
		  else
		  {
			  System.out.println("failed");
		  }
		  
		  // Approach2
		
		/* String actual_title = driver.getTitle();
		  
		  System.out.println(actual_title); */
		  
		  
		
		  
		
		
	
		
		
		
		
		
		

	}

}
