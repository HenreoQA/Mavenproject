package datepickerhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo {

	public static void main(String[] args) {
		
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get("https://www.dummyticket.com/");
		
		driver.manage().window().maximize();
		
		
		// click on buy ticket
		
		driver.findElement(By.xpath("//a[contains(text(),'Buy Ticket')]")).click();
		
		// click on date of birth input box
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		
		// Approach1
		
		// Locating the drop down element for the month and using it to create select class object
		
		WebElement drp = driver.findElement(By.xpath("//select[@aria-label='Select month']")); // locate drop down element
		
		Select selobj = new Select(drp); // creating select class object and passing the drop down element variable
		
		
		// select a specific option/month (Apr) from the drop down using select class object and visibletext
		
		
		selobj.selectByVisibleText("Apr");
		
		
		
		// Locating the drop down element for the year and using it to create select class object
		
		WebElement drp1=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		
		Select selobj1 = new Select(drp1);
		
		
// select a specific option/year (Apr) from the drop down using select class object and visibletext
		
		selobj1.selectByVisibleText("2023");
		
		
		// capture all the dates (table data) from the date picker
		
List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		
		// select or click a specific date (26) from the table using enhanced for loop
		
				for(WebElement dats:alldates)
				{
					String Tex=dats.getText();
					
					if(Tex.equals("20"))
					{
						dats.click();
						
						break;
					}
				}
		
		
		// Approach2
		
		// click on the drop down for the month
		
	/*	driver.findElement(By.xpath("//select[@aria-label='Select month']")).click();
		
		
		// capture or find total number of options in the drop down for the month
		
		List<WebElement> options=driver.findElements(By.xpath("//select[@aria-label='Select month']//option"));
		
		System.out.println(options.size());
		
		// select one option (May) in the drop down for the month using enhanced for loop
		
		for(WebElement opt1:options)
		{
			String text1 = opt1.getText();
			
			if(text1.equals("May"))
			{
				opt1.click();
				
				break;
			}
			
		} 
		
		 
		// click on the drop down for the year
		
		driver.findElement(By.xpath("//select[@aria-label='Select year']")).click();
		
		
		// capture or find total number of the options in the drop down for the year
		
		List<WebElement> option = driver.findElements(By.xpath("//select[@aria-label='Select year']//option"));
		
		System.out.println(option.size());
		
		
		// select one option (2022) in the drop down for the year using enhanced for loop
		
		for(WebElement opt2:option)
		{
			String text2 = opt2.getText();
			
			if(text2.equals("2022"))
			{
				opt2.click();
				
				  break;
			}
				
		}
		
		// capture all the dates (table data) from the date picker
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		  
		
		// select or click a specific date (20) from the table using enhanced for loop
		
		for(WebElement date:dates)
		{
			String Text=date.getText();
			
			if(Text.equals("20"))
			{
				date.click();
				
				break;
			}
		}
		*/
		
		
		
		// Approach3
		
		// click on the drop down for the month and select a specific option/month (June)
		
	/*	driver.findElement(By.xpath("//select[@aria-label='Select month']")).click();
		
		driver.findElement(By.xpath("//select[@aria-label='Select month']//option[6]")).click();
		
		// click on the drop down for the year and select a specific option/year (2022)
		
		driver.findElement(By.xpath("//select[@aria-label='Select year']")).click();
		
		driver.findElement(By.xpath("//select[@aria-label='Select year']//option[99]")).click();
		
		// select or click on a specific date (15) in June, 2022
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]")).click();
		

	*/
	
	}

}
