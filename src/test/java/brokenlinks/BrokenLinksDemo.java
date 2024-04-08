package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) throws IOException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		// capture or locate all the links
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		
		// finding the total number of links
		
		System.out.println("Total number of links is:"+links.size());
		
		// To check if the links contain broken links or not using enhanced for loop
		
		int brokenlinks=0;
		
		for(WebElement linkele:links)
		{
			String hrefAttValue = linkele.getAttribute("href"); // get the links
		//	System.out.println(hrefAttValue); // print the links
			
		// Pre-requisite for checking broken links	
			
			if(hrefAttValue == null || hrefAttValue.isEmpty()) // checking the pre-requisite
			{
				System.out.println("href attribute value is empty");
				continue;
			}
			
		// checking if link is broken or not	
			
			URL linkurl = new URL(hrefAttValue); // To convert the String value of hrefAttValue to URL format to enable us send the request to the server
			
			HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection(); // sending request to the server (which comprises of open and connect). open the connection with typecasting
			
			conn.connect(); // connect to the server
			
			if(conn.getResponseCode()>=400) // get the response code
			{
				System.out.println(hrefAttValue+"     "+"broken links");
				brokenlinks++;
				
			}
			
			else
			{
				System.out.println(hrefAttValue+"     "+"normal links");
			}
			
			
		}
		
		System.out.println("total number of broken links is:"+brokenlinks);
		
		
		

		
		
		
		
		
		
		
		
	}

}
