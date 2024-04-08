package mouseoperationhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			driver.manage().window().maximize();
			
			// create Actions class object
			
			Actions Acts = new Actions(driver);
			
			// locate the source and target elements
			
			WebElement sourceamt = driver.findElement(By.xpath("//*[@id='fourth']/a"));
			
			WebElement tgtamt = driver.findElement(By.xpath("//*[@id='amt7']/li"));
			
			WebElement bank = driver.findElement(By.xpath("//*[@id='credit2']/a"));
			
			WebElement acct1 = driver.findElement(By.xpath("//*[@id='bank']/li"));
			
			Thread.sleep(5000);
			
		   WebElement amt1 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		
		    WebElement amt2 = driver.findElement(By.xpath("//*[@id='amt8']/li"));
		
		    WebElement sales = driver.findElement(By.xpath("//*[@id='credit1']/a"));
		
		   WebElement acct2 = driver.findElement(By.xpath("//*[@id='loan']/li"));
		
		
		   Thread.sleep(5000);
		   
		// drag the source and drop it on the target
			
			Acts.dragAndDrop(sourceamt, tgtamt).build().perform();
			
			Acts.dragAndDrop(bank, acct1).build().perform();
			
		   Acts.dragAndDrop(amt1, amt2).build().perform();
		
		    Acts.dragAndDrop(sales, acct2).build().perform(); 
			
			
			
		
			
			
			
			

	}

}
