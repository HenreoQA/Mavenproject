package dropdowns;

/* HIDDEN DROP DOWNS: These are drop downs with hidden options in the DOM. we can't inspect hidden options in the DOM unless the blur is removed.

How to handle or remove hidden drop downs:

1. Open the drop down

2. Click on event listeners in the DOM

3. Click on blur

4. Click on remove */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithHiddenOptions {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //implicit wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		
		
		

	}

}
