package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	
	/*      BROWSER METHODS: These consist of the following:

1. close(): This is used to close current single browser window which the driver focuses on.

2. quit(): This is used to close multiple browser windows
*/

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		// 1. close():
		
	//	driver.close();
		
	    Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // opens new browser window
		
		 Thread.sleep(3000);
		
		// 2.  quit()
		
		driver.quit();
		
		
		
		
		
		
	}

}
