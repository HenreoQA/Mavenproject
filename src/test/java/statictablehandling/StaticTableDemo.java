package statictablehandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {

	public static void main(String[] args) {
		
		    WebDriver driver = new ChromeDriver();
			
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.get("https://testautomationpractice.blogspot.com");
			
		    driver.manage().window().maximize();
		    
		    
		    // Validate the total number of rows in the table
		    
	List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	
	 int norows=rows.size();
	
	System.out.println("Total number of rows:"+norows);
		    
		    
   // Validate the total number of columns in the table
	
	int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	
	System.out.println("Total number of columns:"+columns);
	
	
	// Capture/read data from a specific row and column (Animesh)
	
	String data = driver.findElement(By.xpath("//td[normalize-space()='Animesh']")).getText();
	
	System.out.println(data);
	
	
	// Capture data from all the rows and columns using looping statement
	
	for(int r=2; r<=norows; r++)
	{
		for(int c=1; c<=columns; c++)
		{
		  String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		// "+r+" and "+c+" are xpath syntax that must be included	
			System.out.print(value+"  ");
			
		}
		System.out.println();
	
	}
	
	
	// Print book names whose author is Amit using looping statement
	
	for(int r=2; r<=norows; r++)
	{
		 String author  = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		 
		 if(author.equals("Amit"))
		 {
			 String Booknames = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		 
			 System.out.println(Booknames);
		 }
	}
	
	
	// Finding sum of prices for all the books
	
	int sum=0;
	
	for(int r=2; r<=norows; r++)
	{
		String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		
		sum= sum + Integer.parseInt(price);
	}
	System.out.println(sum);
	
	
	 
	
	
	
	
	
	   
	
	
	
	
	
	
		
		
		
		

	}

}
