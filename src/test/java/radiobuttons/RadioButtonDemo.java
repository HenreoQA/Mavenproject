package radiobuttons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException  {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().window().maximize();
		
		
		// Validate that internet explorer button is checked by default
		
		
		WebElement rd= driver.findElement(By.xpath("//form[contains(text(),'Your current web browser is:')]//input[1]"));
	
		// Approach1
		
		//System.out.println(rd.isSelected()); 
		
		// Approach2
		
/*		if(rd.isSelected())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		*/
		
		
		// Validate that Mozilla button can be checked
		
		
//	driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]")).click();
		
	
	// Validate that Opera button can be checked
		
	
//	driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[3]")).click();
	
		
		
      //   Validate that the number of radio button is 3
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Total number of radio buttons:"+radios.size());
		
		Thread.sleep(3000);
		
		
		// Validate that all the radio buttons cannot be selected at once (They are selected one after the other)
		
		// using enhanced for loop
		
		for(WebElement rd1:radios)
		{
			rd1.click();
		}
		
		
		
			
		
	}

}
