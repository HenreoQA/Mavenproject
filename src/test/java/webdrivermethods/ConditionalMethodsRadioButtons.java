package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsRadioButtons {

	public static void main(String[] args) {
		
/* Conditional methods: These contains the following:
 
 1. isDisplayed(): To check if the element is displayed on the web page or not
 2. isEnabled(): To check if an element is enabled or not
 3. isSelected(): To check if an element is selected or not		
 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
// 1. isDisplayed(): To check if the element (nopCommerce) is displayed on the web page or not
	
	Boolean displaystatus= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
			
	    System.out.println(displaystatus);
	    
	    // OR
	    
//	System.out.println(driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed());
	    
	    
// 2. isEnabled(): To check if an element (search box) is enabled or not
	
System.out.println(driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).isEnabled());
	
	
// 3. isSelected(): To check if elements (male and female radio buttons) are selected or not

     // BEFORE THE SELECTION OF THE BUTTONS:

  driver.findElement(By.xpath("//*[@id='gender-male']")).isSelected();

  System.out.println(driver.findElement(By.xpath("//*[@id='gender-male']")).isSelected());
  
  
  driver.findElement(By.xpath("//*[@id='gender-female']")).isSelected();

  System.out.println(driver.findElement(By.xpath("//*[@id='gender-female']")).isSelected());
    

  
  // AFTER SELECTION OF THE BUTTONS:
  
  driver.findElement(By.xpath("//*[@id='gender-male']")).click(); // male is selected only

  System.out.println(driver.findElement(By.xpath("//*[@id='gender-male']")).isSelected());
  System.out.println(driver.findElement(By.xpath("//*[@id='gender-female']")).isSelected());
  
  
   driver.findElement(By.xpath("//*[@id='gender-female']")).click(); // female is selected only

  System.out.println(driver.findElement(By.xpath("//*[@id='gender-female']")).isSelected());
  System.out.println(driver.findElement(By.xpath("//*[@id='gender-male']")).isSelected());
  
  
  
  
  
  
	
	
	    
	    
	    
	    
	}

}
