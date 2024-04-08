package invocationcounttestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationDemo {

	 WebDriver driver;
	 
	@Test(invocationCount=5)
	void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	} 
	
	
}
