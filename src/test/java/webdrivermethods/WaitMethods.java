package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMethods {
	
// Implicit wait: This command is added using webdriver instance, and the command is written after the creation of the webdriver.

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait
		 
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		driver.manage().window().maximize();
			
			
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		
			

	}

}
