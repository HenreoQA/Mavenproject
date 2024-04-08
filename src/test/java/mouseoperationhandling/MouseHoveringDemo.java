package mouseoperationhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringDemo {

	public static void main(String[] args) {
		
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
			driver.get("https://demo.nopcommerce.com/");
			
			driver.manage().window().maximize();
			
			// To mouse hover over Electronics and Cell phones and click on cell phones, we do the following:
			
			// 1. locating the elements
			
 WebElement Electronics = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
			
WebElement Cellphones = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']"));			
			
     
          // 2. creating Actions class object

            Actions act = new Actions(driver); // creating actions class object and passing driver instance
	
	
          // 3. mouse hovering over Electronics and Cell phones and clicking on cell phones
	
	     // Approach1
	
//	act.moveToElement(Electronics).moveToElement(Cellphones).click().build().perform(); // build() creates action and perform() completes the action

	    // Approach2
	
	act.moveToElement(Electronics).moveToElement(Cellphones).click().perform(); // directly completes the action with build command creating or executing internally

	
	


	}

}
