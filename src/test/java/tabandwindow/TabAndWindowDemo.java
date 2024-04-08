package tabandwindow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabAndWindowDemo {

	public static void main(String[] args) {
		
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
			driver.manage().window().maximize();
			
			// opening the applications on different tabs or windows
			
			driver.get(" https://text-compare.com/");
			
			driver.switchTo().newWindow(WindowType.TAB); // open new tab
			
		//	driver.switchTo().newWindow(WindowType.WINDOW); // open new window
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		
		
		
		
		
		
		
		

	}

}
