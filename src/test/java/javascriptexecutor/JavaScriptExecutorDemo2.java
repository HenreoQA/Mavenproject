package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
			driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
			
			driver.manage().window().maximize();
			
			
			// creating javascriptexecutor
			
			JavascriptExecutor JS = (JavascriptExecutor) driver;
			
			
			// scroll down the page by pixel
			
			JS.executeScript("window.scrollBy(0,3000)", ""); // 3000 pixel size (you can choose any number)
			
			
			// To check the size or location of the pixel
			
			System.out.println(JS.executeScript("return window.pageYOffset;"));
			
			
			// scroll down the page until a particular element (Nigeria flag) is present or visible
			
			WebElement flag = driver.findElement(By.xpath("//img[@alt='Flag of Nigeria']")); // locate the element
			
			JS.executeScript("arguments[0].scrollIntoView();", flag);
		
			
			// To check the size or location of the pixel
			
			System.out.println(JS.executeScript("return window.pageYOffset;"));
			
			
			// scroll down till the end of the page
			
			JS.executeScript("window.scrollBy(0, document.body.scrollHeight)");
			
			Thread.sleep(3000);
						
		
			// scroll back to the initial position
			
			JS.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
