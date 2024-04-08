package mouseoperationhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		
	        WebDriver driver=new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
			driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
			
			driver.manage().window().maximize();
			
			// create Actions class object
			
			Actions acts = new Actions(driver);
			
			// locate the element (min_slider)
			
			WebElement min_slider= driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
			
		  // get the current location of the min_slider (X,Y axis)
			
			System.out.println(min_slider.getLocation()); // location of min_slider before moving
			
			// drag the min_slider to new location and print the new location after moving
			
			Thread.sleep(5000);
			
			acts.dragAndDropBy(min_slider, 100, 251).perform();
			
			System.out.println(min_slider.getLocation()); // location of min_slider after moving
			
			
			// locate the element (max_slider)
			
			WebElement max_slider= driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
						
		 // get the current location of the max_slider
						
		System.out.println(max_slider.getLocation()); // location of max_slider before moving
						
	    // drag the max_slider to new location and print the new location after moving
						
				 Thread.sleep(5000);
						
			acts.dragAndDropBy(max_slider, -44, 251).perform();
						
		System.out.println(max_slider.getLocation()); // location of max_slider after moving
						
						
			
			
			
			
			
			

	}

}
