package customizedlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSSelector 
{
	/* FOUR DIFFERENT COMBINATIONS OF CSS SELECTOR: You can use any of them

		 1. Tag and id: These can be separated using #

		 2. Tag and class: These can be separated using .

		 3. Tag and attribute: These can be separated using [ ]

		 4. tag, class, and attribute: These can be separated using . [ ]

		 NOTE: In the above combination, tag is optional */

	public static void main(String[] args) 
	{
		// Launch the browser
		
		WebDriver driver=new EdgeDriver();
		
		// open the url (https://demo.nopcommerce.com)
		
		driver.get("https://demo.nopcommerce.com");
		
		// To maximize the web page
		
		driver.manage().window().maximize();
		
		// verify search box using tag and id (test data = macbook)
		
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("macbook");
		
		// input = tagname, small-searchterms = id
		
		
		// verify search box using tag and class (test data = cell phones)
		
	//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("cell phones");
		
		
		// verify search box using tag and attribute (test data = desktops)
		
	//	driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("desktops");
		
		
		// verify search box using tag, class and attribute (test data = software)
		
		driver.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("software");
		
		

	}

}
