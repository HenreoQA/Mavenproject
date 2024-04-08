package tabandwindow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabAndWindowDemo2 {

	public static void main(String[] args) {
		
		    WebDriver driver1=new ChromeDriver();
	
		    WebDriver driver2=new ChromeDriver();
		    
			driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
			driver1.manage().window().maximize();
			
			driver2.manage().window().maximize();
			
			
			// Alternative way to opening the applications on different windows using two different drivers
			
			driver1.get(" https://text-compare.com/");
			
			driver2.get("https://opensource-demo.orangehrmlive.com");
			
			
			
		
		
		
		
		
		
		
		
		

	}

}
