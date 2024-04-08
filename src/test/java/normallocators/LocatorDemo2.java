package normallocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo2 {
	
	// To find multiple web element

	public static void main(String[] args) 
	{
		// To launch edge browser
		
		   WebDriver driver=new EdgeDriver();
		   
		   // To open the url on the browser (http://www.automationpractice.pl/index.php)
		   
		   driver.get("http://www.automationpractice.pl/index.php");
		   
		   // To maximize the page
		   
		   driver.manage().window().maximize();
		   
		   // To capture or find total number of sliders on home page using classname
		   
		   List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		   
		   System.out.println("Total number of sliders is:"+sliders.size());
		   
		   // To capture or find total number of images on home page using tagname

	       List<WebElement>images=driver.findElements(By.tagName("img"));
	       
	       System.out.println("Total number of images is:"+images.size());
	       
	    // To capture or find total number of links on home page using tagname
	       
	       List<WebElement>links=driver.findElements(By.tagName("a"));
	       
	       System.out.println("Total number of links is:"+links.size());
	       
	
	}

}
