package browserwindowhandling;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowDemo2 {

	public static void main(String[] args) {
		
		    WebDriver driver = new ChromeDriver();
			
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.get("https://testautomationpractice.blogspot.com/");
			
		    driver.manage().window().maximize();
		    
		    
		    // search for selenium in the search box
		    
	driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		
	driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();	
	
	
	// open the links on various browser windows
	
	// Approach1
	
/*	driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
	
	driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
	
	driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
	
	driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
	
	driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();*/
	
	
	
	// Approach2 - find the number of the links and open them on various browsers using enhanced for loop
	// select one of the links and locate the element
	
	List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
	
	System.out.println("Number of Links:"+ searchlinks.size());
	
	
	for(WebElement link:searchlinks)
	{
		link.click();
	}
	
	
	// capture the browser windows id
	
	Set<String> windowids = driver.getWindowHandles();
	
	
	// switch to the windows and get the title of the page using enhanced for loop
	
	for(String win:windowids)
	{
		String Title = driver.switchTo().window(win).getTitle();
		
		System.out.println(Title);
		
	}
	

	
	// close the windows using enhanced for loop
	
	// Approach1
	
/*	for(String win:windowids)
	{
		String Title = driver.switchTo().window(win).getTitle();
	
		if(Title.equals("Automation Testing Practice")||Title.equals("selenium - Search results - Wikipedia")
		||Title.equals("Selenium dioxide - Wikipedia")||Title.equals("Selenium (software) - Wikipedia")
		||Title.equals("Selenium disulfide - Wikipedia")||Title.equals("Selenium in biology - Wikipedia")
		||Title.equals("Selenium - Wikipedia"))
		{
			driver.close();
		}
		
		
	}*/

	
	// Approach2
	
	driver.quit();

	
     

		

		
		
	
	
	
		
		
		

	}

}
