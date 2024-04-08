package alertshandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithOkAndCancel {

	public static void main(String[] args)  {
		
        WebDriverManager.chromedriver().setup();
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		
		// Clicking on JS Confirm will bring out an alert with ok and cancel button
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		
		// Handling the alert with ok and cancel button
		
	//	driver.switchTo().alert().accept(); // This will handle alert with ok button
		
	
	//	driver.switchTo().alert().dismiss(); // This will handle alert with cancel button
		
		
		// Printing or validating the alert message
		
		// Approach1
		
	/*	Alert alertwindow=driver.switchTo().alert();
		
		System.out.println(alertwindow.getText()); */
		
		
		// Approach2
		
     System.out.println(driver.switchTo().alert().getText());
     
   
		
		
		
		

	}

}
