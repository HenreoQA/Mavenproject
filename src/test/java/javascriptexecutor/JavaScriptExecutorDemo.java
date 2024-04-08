package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// locating the input box element (Name, Email, Phone) and handle them using javascriptexecutor
		
		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='phone']"));
		
		
		// creating javascriptexecutor interface
		
		JavascriptExecutor Js = (JavascriptExecutor)driver; // Typecasting
		
		// calling executescript() method to perform actions on the elements
		
		Js.executeScript("arguments[0].setAttribute('value', 'Mike')", Name);
		
		Js.executeScript("arguments[0].setAttribute('value', 'abc@gmail.com')", Email);
	
		Js.executeScript("arguments[0].setAttribute('value', '0123456789')", Phone);
		
		
		// Handling radio button using javascriptexecutor
		
		// locate the radio button element (Male)
		
	     WebElement Male = driver.findElement(By.xpath("//input[@id='male']"));
	     
	     // calling executescript() method
	     
	     Js.executeScript("arguments[0].click();", Male);
		
				
		
		
		
		
		
		

	
	}

}
