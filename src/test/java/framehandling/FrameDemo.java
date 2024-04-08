package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		// Finding the frame1 web element and switch to the frame1
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1); // switch to frame1
		
		
		// Validating the input box in frame1 (by passing 1234 in the box) 
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("1111");
		
		
// driver has to go back to the main web page before switching to frame2 using this command
		
		driver.switchTo().defaultContent(); // switching back to the main page
		
		
		// Finding the frame2 web element, switch to frame2 and validating input box in frame2
		
		WebElement frame2 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("2222");
		
	
	driver.switchTo().defaultContent(); // switching back to the main page before switching to frame3
		
		
	// Finding the frame3 web element, switch to frame3 and validating input box in frame3
		
		WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
				
		driver.switchTo().frame(frame3);
				
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("3333");
		
		
	// Finding the iframe web element, switch to iframe directly and validating radio button and check box in the iframe
		
		
		// Approach1 - using index
		
		driver.switchTo().frame(0); // Directly switch to iframe using zero as index
		
        driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div")).click();
		
		driver.findElement(By.xpath("//div[@id='i19']//div[@class='uHMk6b fsHoPb']")).click();
		
		
		// Approach2 - using webelement
		
	/*	 WebElement ifr = driver.findElement(By.tagName("iframe"));
			
		driver.switchTo().frame(ifr);
			
		driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div")).click();
			
		driver.findElement(By.xpath("//div[@id='i19']//div[@class='uHMk6b fsHoPb']")).click();
		*/	
		
		
		driver.switchTo().defaultContent(); // switching back to main page before switching to frame4
		
		
		// Finding the frame4 web element, switch to frame4 and validating input box in frame4
		
			WebElement frame4 =driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
						
			driver.switchTo().frame(frame4);
						
			driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("4444");
			
			
			driver.switchTo().defaultContent(); // switching back to main page before switching to frame5
			
			

// Finding the frame5 web element, switch to frame5
			
		WebElement frame5 =driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
							
			driver.switchTo().frame(frame5);
			
			
		
		
				
		
		
		
		
		
		
		

	}

}
