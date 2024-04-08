package alertshandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithOkDemo1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		
		// Clicking on JS alert will bring out an alert with ok button
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		
		// Printing or validating the alert message
		
		  System.out.println(driver.switchTo().alert().getText());
		
		
		// Handling the alert with ok button
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	

	}

}
