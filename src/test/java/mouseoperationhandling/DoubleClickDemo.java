package mouseoperationhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get(" https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		
		// handle or switch to the frame
		
          driver.switchTo().frame("iframeResult");
          
        // locate field1 element and clear the placeholder (Hello World!)
          
         driver.findElement(By.xpath("//input[@id='field1']")).clear();
         
      
          // insert a value in the field1 element or box (Automation)
          
          driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("Automation");
          
      
          // capture or locate copy text element
          
          WebElement CT = driver.findElement(By.xpath("//button[text()='Copy Text']"));
          
          
            // creating Actions class object
          
               Actions act2 = new Actions(driver);
              
              Thread.sleep(5000);
              
              act2.doubleClick(CT).perform();
              
              // validate the text copied into the field2 box (Automation)
              
              WebElement F2 = driver.findElement(By.xpath("//input[@id='field2']"));
              
               // System.out.println(F2.getText()); // returns the inner text of the element
              
              System.out.println(F2.getAttribute("value")); // returns the value of the attribute of the element
          
          
		
		
		
		
		
		
		
		
		
		
		

	}

}
