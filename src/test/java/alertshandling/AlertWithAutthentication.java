package alertshandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithAutthentication {

	public static void main(String[] args) {
		
		
		    WebDriverManager.chromedriver().setup();
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://the-internet.herokuapp.com/basic_auth");
			
	// Handling the alert by passing/injecting admin as username and admin@ as password along with the url
			
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			driver.manage().window().maximize();
			
			
			// Validating the text value by locating the element first
			
			// Approach1
			
			String text= driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
			
			System.out.println(text);
			
			
			// Approach2 - using equals string method
			
	String actualtext= driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
	
	String exptext="Congratulations! You must have the proper credentials.";
	
	if(actualtext.equals(exptext))
	{
		System.out.println("pass");
	}
	
	else
	{
		System.out.println("fail");
	}
			
	
	// Approach3 - contains string method
	
  String text1= driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
  
  if(text1.contains("Congratulations"))
  {
	  System.out.println("successful");
  }
  
  else
  {
	  System.out.println("unsuccessful");
  }
  
  
			
			
			
			
			
			
			
			
			
			
	}

}
