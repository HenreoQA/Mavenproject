package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDownDemo {

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='L2AGLb']/div")).click(); // popups
		
		
		// Verifying the search box by passing "selenium" as a parameter
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
	
		// Verify the total number of auto suggested drop down options by selecting any option and locate the elements
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']//child::li"));
		
		System.out.println("Total number of suggested drop down options:"+list.size());
		
		
		// Printing all the suggested drop down options using enhanced for loop
		
	/*	for(WebElement Li:list)
		{
			System.out.println(Li.getText());
		} */
		
		
		// Selecting or clicking on a specific suggested drop down option
		
		// Approach1 - using enhanced for loop
		
	/*	for(WebElement Li:list)
		{
			String text=Li.getText();
			
			if(text.equals("selenium webdrver"))
			{
				Li.click();
				
				break;
			}
			
		 } */
		
		
		// Approach2 - Locating the element
		
		driver.findElement(By.xpath("//b[normalize-space()='webdriver']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
