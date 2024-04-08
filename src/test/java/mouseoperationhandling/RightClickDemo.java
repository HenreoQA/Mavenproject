package mouseoperationhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		
	            WebDriver driver=new ChromeDriver();
		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
				
				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				
				driver.manage().window().maximize();
				
				// To perform right click operations, we do the following:
				
				// 1. capture or locate the element
				
	WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));		
	
	           // 2. create Actions class object
	
	          Actions act1 = new Actions(driver);
	          
	       
	      // 3. perform the right click action using contextClick() method, then pass the element and complete the action by adding perform()
	          
	          act1.contextClick(button).perform();
	          
	          
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
