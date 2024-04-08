package guru99bankproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginInvalidUserIdAndValidPassword {

	public static void main(String[] args) {
		
        WebDriverManager.firefoxdriver().setup(); 
	 	
		WebDriver driver=new FirefoxDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		
		
		// login with invalid user Id and valid password
		
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("abcde12345"); // Invalid User ID
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vubAbet"); // Valid Password
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click(); // click login
		
		
		
		
		
		

	}

}
