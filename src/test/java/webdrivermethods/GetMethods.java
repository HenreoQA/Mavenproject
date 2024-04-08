package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	
	/* GET METHODS: These contain the following:

1. get(url) - We pass url of the application and it will open the application on the browser.

2. getTitle() - This will return the current title of the web page.

3. getCurrentURL() - This will return the current url of the web page.

4. getPageSource() - This will provide the page source of the current web page, which means the HTML of the current web page will be written.

5. getWindowHandle() - This will return the id of a single browser window. The id is dynamically generated anytime we open a new window on the browser.

6. getWindowHandles() - This will return the id of multiple browser window. */
		     

	public static void main(String[] args) 
	{
		// Launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// 1. get(url) - https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Maximize the page
		
		driver.manage().window().maximize();
		
		// 2. getTitle()
		
		driver.getTitle();
		System.out.println("Title of the page is:"+driver.getTitle());
		
		// 3. getCurrentURL()
		
		driver.getCurrentUrl();
		System.out.println("The current url is:"+driver.getCurrentUrl());
		
		// 4. getPageSource()
		
		driver.getPageSource();
		System.out.println("The page source is:"+driver.getPageSource());
		
		// To check if html is present in the page source
		
		String ps= driver.getPageSource();
		System.out.println(ps.contains("html"));
		
		// 5. getWindowHandle()
		
		driver.getWindowHandle();
		
		System.out.println("Window handle is:"+driver.getWindowHandle());
		
		// 6. getWindowHandles()
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // opens new browser window
		
	//	System.out.println(driver.getWindowHandles());
		
		// OR using enhanced for loop
		
		Set<String> w=driver.getWindowHandles();
		
		for(String x:w)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
