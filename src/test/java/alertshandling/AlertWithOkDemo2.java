package alertshandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithOkDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		
// Find the sign-in element click on the sign-in button (with no username and password)
		
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		
		// Capture the alert message and handle the alert
		
		System.out.println(driver.switchTo().alert().getText()); // Alert message
		
		driver.switchTo().alert().accept(); // handle the alert
		
		
	
	
		
		
		
		
		
		
		
		
		
	}

}
