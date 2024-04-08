package customizedlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemo {

	public static void main(String[] args) 
	{

	//  HOW TO WRITE OUR OWN XPATH:

	/*	 The syntax is: //tagname[@attribute='value']

		  If you don't know the tagname, use this syntax:  //*[attribute='value'] */


		// Launch the browser
		
		WebDriver driver=new EdgeDriver();
		
		// open the url (https://demo.opencart.com)
		
		driver.get("https://demo.opencart.com");
		
		// To maximize the web page
		
		driver.manage().window().maximize();
		
		// verify search box (test data=iphone)
		
	//	driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
		
		
		// If the element does not have tagname
		
	//	driver.findElement(By.xpath("//*[@name='search']")).sendKeys("iphone");
		
		// using parent element if the child element does not have attribute
		
	//	driver.findElement(By.xpath("//div[@id='search']/input")).sendKeys("macbook");
		
		
		// Verify or capture product name (macbook)
		
    //   System.out.println(driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText());
		
		// OR
       
	String product_name=driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
	
	System.out.println(product_name);
	
	
	


	}

}
