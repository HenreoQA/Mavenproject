package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectTag {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //implicit wait
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		
		// How to click on the drop down
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		
		
		// How to capture or find total number of options in the drop down
		
		List<WebElement> options= driver.findElements(By.xpath(" //ul[@class='multiselect-container dropdown-menu']/li"));
		
		System.out.println("Total number of options:"+options.size());
		
		
		// How to print the options in the drop down using looping statement
		
		// using enhanced for loop
		
	/*	for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}*/
		
		
		// How to select multiple options in the drop down using enhanced for loop
		
		
	/*	for(WebElement opt:options)
		{
			String text= opt.getText();
			
			if(text.equals("Java")||text.equals("MySQL")||text.equals("Python"))
			{
				opt.click();
				
			}
		} */
		
		
	//	How to select all the options in the drop down using enhanced for loop
		
	/*	for(WebElement opt:options)
		{
			opt.click();
		}*/
		
		
		// How to select only one option in the drop down using enhanced for loop
		
		// Approach1
		
	/*	for(WebElement opt:options)
		{
			String text= opt.getText();
			
			if(text.equals("JQuery"))
			{
				opt.click();
				break;
				
			}
		}*/
		
		
		// Approach2
		
	//	driver.findElement(By.xpath("//input[@value='Oracle']")).click();
			
		
		
		
		
		
		
	}

}
