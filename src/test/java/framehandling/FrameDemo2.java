package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo2 {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		
		// Finding webelement of the frame and switching to the frame
		
	//	WebElement fram = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
		
	//	driver.switchTo().frame(fram); // using webelement
		
		driver.switchTo().frame(0); // using index
		
		
		// Clear the placeholder or existing text in the frame
		
		driver.findElement(By.xpath("//*[@id='tinymce']/p")).clear();
		
		
		// Type new text (Automation) in the frame
		
		driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).sendKeys("Automation");
		
		
		// Select the text (Automation)
		
		driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).sendKeys(Keys.CONTROL+"A");
		
		
// Make the text (Automation) bold by going back to the main page first and then locate the element
		
		driver.switchTo().defaultContent(); // going back to the main page
		
		driver.findElement(By.xpath("//button[@title='Bold']")).click();
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
