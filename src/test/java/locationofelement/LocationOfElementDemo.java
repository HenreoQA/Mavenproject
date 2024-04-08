package locationofelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfElementDemo {

	public static void main(String[] args) {
		
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.manage().window().maximize();
			
			// locate the logo element
			
			WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
			
			// location of the logo after maximizing window
			
			System.out.println("Location of logo after maximizing is:"+logo.getLocation());
			
			// location of the logo after minimizing window
			
			driver.manage().window().minimize();
			
			System.out.println("Location of logo after minimizing is:"+logo.getLocation());
			
			// location of the logo after fullscreen window
			
			driver.manage().window().fullscreen();
						
		System.out.println("Location of logo after fullscreen is:"+logo.getLocation());
		
		
		// location of the logo after setting the size of the window
		
		  Point p = new Point(100,100); // create point object and pass it on the setposition
		
        driver.manage().window().setPosition(p);
					
		System.out.println("Location of logo after setting position is:"+logo.getLocation());
					
					
						
						
			
			
			
			
			
			
			
	}

}
