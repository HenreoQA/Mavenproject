package alertshandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithInputBox {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		
// Clicking on JS prompt will bring out alert with input box along with ok and cancel button

		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		
		// Printing or validating the alert message
		
		  System.out.println(driver.switchTo().alert().getText());
		  
		  
		  // Passing text or value (welcome) in the input box and handling the alert with ok button
		  
		  Alert alertwindow = driver.switchTo().alert(); // alertwindow is a variable
		  
		  alertwindow.sendKeys("welcome"); // passing the value (welcome)
		  
		  alertwindow.accept(); // handling the alert with ok button
		  
		//  alertwindow.dismiss(); // handling the alert with cancel button
		  
		  
		  // Validating the input text or value (welcome)
		  
		  // Approach1 - Locating the element (welcome) and print the text
		  
		  driver.findElement(By.xpath("//p[@id='result']")).getText();
		  
		  System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		  
		  
		  // Approach2 - Locating the element (welcome) and print the text
		  
		  String actualtext= driver.findElement(By.xpath("//p[@id='result']")).getText();
		  
		  String exptext= "You entered: welcome";
		  
		  if(actualtext.equals(exptext))
		  {
			  System.out.println(true);
		  }
		  
		  else
		  {
			  System.out.println(false);
		  }
		  
		  
		  
		  
		  
		
		
		
		
		

	}

}
