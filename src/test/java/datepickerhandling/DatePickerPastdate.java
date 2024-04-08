package datepickerhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerPastdate {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
			driver.get(" https://jqueryui.com/datepicker/");
			
			driver.manage().window().maximize();
			
			
			// switching to the frame
			
			driver.switchTo().frame(0);
			
			
// Approach1: for past date - Inserting month, date, year (mm/dd/yyyy) directly into the input box
			
	//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/17/2022");
			
			
			// Approach2:
			
			// For past date (expected dates)
			
			String year = "2022";
			String month = "March";
			String date = "28";
			
			driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // open date picker
			
			// select month and year from the date picker using while loop
			
			while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equals(mon) && year.equals(yr)) // compare the actual value with the expected value
			{
				break;
			}
			else
			{
			  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // clicking back arrow
			}
			
		}
			
			// select date from the date picker using enhanced for loop
			
			// capture all the dates (table data) from the date picker
			
			List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
			
			for(WebElement dt:alldates)
			{
				dt.getText(); // capture the actual value/date
				
				if(dt.getText().equals(date)) // compare the actual value with the expected value
				{
					dt.click();
					break;
				}
				
				
			} 
			
			
			// Using normal for loop
			
		/*	for(int i=0; i<alldates.size(); i++)
			{
				
				alldates.get(i).getText(); // capture the actual value/date
				
				if(alldates.get(i).getText().equals(date))
				{
					alldates.get(i).click();
					
					break;
				}
					
					
			} */
			
		
			
			

	}

}
