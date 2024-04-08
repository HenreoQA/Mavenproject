package dynamicpaginationtablehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicPaginationTableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		driver.manage().window().maximize();
		
		
		   // Login
		
		WebElement username=driver.findElement(By.id("input-username")); // locating the element
		username.clear(); // clear the placeholder in the box
		username.sendKeys("demo");  // input the username (demo)
				
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear(); // clear the placeholder in the box
		password.sendKeys("demo"); // input the password (demo)
				
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // click login button
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		// Click on customers to access the customers table (Customers--->customers)
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@class='collapse show']//a[contains(text(),'Customers')]")).click();
		
		
		// To get the total number of pages
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();  // Showing 1 to 10 of 17603 (1761 Pages)
		
			
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		
		System.out.println("Total number of pages:"+total_pages);
		
		
		// Clicking on the pages, get the total number of rows and read the data in the table
		
		for(int p=1;p<=10;p++)   //for(int p=1;p<=total_pages;p++)
		{
			if(total_pages>1)
			{
				WebElement active_Page= driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));	
				System.out.println(" Active Page : "+active_Page.getText());
				active_Page.click(); // clicking on the pages
				Thread.sleep(2000);
				
			}
			
		 	int noOfrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println(" Total No Of Rows in active Page : "+noOfrows); // total number of rows
			
			for(int r=1;r<=noOfrows;r++) // read the data in the table
			{
				String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String customerEmail=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
				
				System.out.println(customerName+"      "+customerEmail+"          "+status);
			}
			
		}
		
	
			

	



		

	}

}
