package endtoendtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightTravelWebApp {

	public static void main(String[] args) {
		
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
			driver.get("https://blazedemo.com/");
			
			driver.manage().window().maximize();
			
			
			//  select the options from the dropdowns and click on find flights
			
			// Departure city
			
			
			WebElement drp1=driver.findElement(By.xpath("//select[@name='fromPort']")); // locating dropdown element
			
			Select s1 = new Select(drp1); // creating select class object
			
			s1.selectByVisibleText("Portland");
			
			
			// Destination city
			
			WebElement drp2=driver.findElement(By.xpath("//select[@name='toPort']"));
			
			Select s2 = new Select(drp2);
			
			s2.selectByVisibleText("Dublin");
			
			
			// click on find flights
			
			driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
			
			
			//  find the lowest price and click on the corresponding 'choose this flight'
			
			driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
			
			
			// provide all the details in the boxes and click on purchase flight
			
			// provide all the details in the boxes
			
			driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Henry agulanna"); // name
			
			driver.findElement(By.xpath("//input[@id='address']")).sendKeys("27 Oxford Road"); // address
			
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Oxford"); // city
			
			driver.findElement(By.xpath("//input[@id='state']")).sendKeys("West Midlands"); // state
			
			driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("24689"); // zip code
			
			// click on the dropdown and select card type
			
			// Approach1
			
		/*	driver.findElement(By.xpath("//select[@id='cardType']")).click();
			
			driver.findElement(By.xpath("//*[@id=\"cardType\"]/option[2]")).click(); */
			
			// Approach2: using select class object
			
			WebElement drpd = driver.findElement(By.xpath("//select[@id='cardType']"));
			
			Select s3 = new Select(drpd);
			
			s3.selectByIndex(1);
			
			driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("0123456789"); // credit card number
			
			driver.findElement(By.xpath("//input[@id='creditCardMonth']")).clear(); // clear placeholder month
			
			driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("07"); // credit card month
			
			driver.findElement(By.xpath("//input[@id='creditCardYear']")).clear(); // clear placeholder year
			
			driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2028");
			
			driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Henry Agulanna"); // card name
			
			driver.findElement(By.xpath("//input[@id='rememberMe']")).click(); // remember me
			
			driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click(); // purchase flight
			
			
			// validate the successful message
			
			String Text = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
			
			System.out.println(Text);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
