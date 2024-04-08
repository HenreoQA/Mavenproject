package normallocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo {
	
	// To find single web element

	public static void main(String[] args) 
	{
		// To launch edge browser
		
	   WebDriver driver=new EdgeDriver();
	   
	   
	   // To open the url on the browser (http://www.automationpractice.pl/index.php)
	   
	   driver.get("http://www.automationpractice.pl/index.php");
	   
	  
	   // To maximize the page
	   
	   driver.manage().window().maximize();
	   
	  
	   // Verify the search box (using T-shirts as test data)
	   
      driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
	   
	   
	   // verify the search button
	   
	   driver.findElement(By.name("submit_search")).click();
	      
	      
	    // verify the link
	   
	   driver.findElement(By.linkText("Printed Chiffon Dress")).click();
	   
	   

	}

}
