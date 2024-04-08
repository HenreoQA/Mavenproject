package browserwindowhandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowDemo {

	public static void main(String[] args) {
		
         WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    driver.manage().window().maximize();
	    
	    
	    // open new browser window
	    
	    driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	    
	     
	    // Capture browser windows ids
	    
	    Set<String> windowids= driver.getWindowHandles(); // contain 2 windows ids
	    
	    
	    // switching to browser windows
	    
	    
	 // Approach1 - Using list collection - use this if you have only two browser windows
	    
 /*	    List<String>windowidsList= new ArrayList(windowids); // converting set to list collection in order to use get method
	    
	    String parentwindow=windowidsList.get(0); // parent window
	    
	    String childwindow = windowidsList.get(1); // child window
	    
	    
	    // switching to child window and clicking on contact sales
	    
	    driver.switchTo().window(childwindow);
	    
	    driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/button")).click();
	    
	    
	    // switching to parent window and input admin as username
	    
	    driver.switchTo().window(parentwindow);
	    
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	    */
	
// Approach2 - using enhanced for loop to get the page title and then switch to the browser window
	    
	    
	   for(String winid:windowids)
	    {
	    	String Title=driver.switchTo().window(winid).getTitle();
	    	System.out.println(Title);
	    	
	    	if(Title.equals("OrangeHRM HR Software | OrangeHRM"))
	    	{
	    	  driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[2]/a/button")).click();
	    	}
	   }
	    
	    
	    // Closing specific browser window based on choice
	    
	/*    for(String winid:windowids)
	    {
	    	String Title=driver.switchTo().window(winid).getTitle();
	    	
	    	if(Title.equals("OrangeHRM HR Software | OrangeHRM") || Title.equals("OrangeHRM"))
	    	{
	    	  driver.close();
	    	}
	    	
	    
	    }
	
		*/
		
		
		
		
		
		

	}

}
