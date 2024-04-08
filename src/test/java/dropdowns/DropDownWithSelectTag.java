package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropDownWithSelectTag {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //implicit wait
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		
		// Finding drop down element and creating select class object
        
	    
       WebElement drpele=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		
	    Select drpobj=new Select(drpele); // creating select class object
	    
	  
	    // How to select a specific option from the drop down using select class object
	    
	    
	   // drpobj.selectByVisibleText("March"); //select by visibletext
	    
	  //  drpobj.selectByValue("3"); // select by value
	    
	    drpobj.selectByIndex(3); // select by index
	    
	   
	    // How to find the total number of options in the drop down using getoptions method
	    
         List<WebElement> options= drpobj.getOptions();
         
         System.out.println("Total number of options:"+options.size());
	             
        
         // How to print the options available in the drop down using looping statement and getText method
        
         // You will first of all find the total number of options in the drop down
         
         
         // using normal for loop
         
      /*   for(int i=0; i<options.size(); i++)
         {
        	 System.out.println(options.get(i).getText());
         } */
	    
        
         // using enhanced for loop
         
      /*  for(WebElement op:options)
         {
        	System.out.println(op.getText()); 
         } */
         
         
         // How to print the first two of the options using normal for loop
         
         for(int i=0; i<options.size(); i++)
         {
        	 if(i<2)
        	 System.out.println(options.get(i).getText());
         } 
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
