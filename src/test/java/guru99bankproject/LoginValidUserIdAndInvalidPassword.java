package guru99bankproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginValidUserIdAndInvalidPassword {

	public static void main(String[] args) {
		
        WebDriverManager.firefoxdriver().setup(); 
		
		WebDriver driver=new FirefoxDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		
		
		// login with valid user Id and invalid password
		
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr554036"); // valid User ID
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234rty"); // Invalid Password
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click(); // click login

	
	
	}

}
