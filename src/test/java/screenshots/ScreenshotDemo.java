package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// capture full page screenshot: available in selenium 3 & 4
		
		TakesScreenshot ts = (TakesScreenshot) driver; // create takesscreenshot instance/object (with typecasting). This is used only if you want to capture fullpage
		
		File scr = ts.getScreenshotAs(OutputType.FILE); // capture the screenshot
		
		File trg = new File("C:\\Users\\user\\Dropbox\\PC\\Documents\\Eclipse Workspace Folder\\Webdrivermavenproject\\Screenshot1\\fullpage.png"); // create a folder to save the screenshot and copy and paste the location
		
		// How to create folder: right click on Webdrivermavenproject-->new-->folder-->folder name(screenshot1)
		
		// How to copy the location: right click on folder name(screenshot1)-->properties-->copy the location
		
		FileUtils.copyFile(scr, trg); // copy the screenshot scr (source file) to the folder(target file)
		
		
		// capture the screenshot of a specific element or area: available in selenium 4 and above
		// To capture a specific web element, you don't need to create takesscreenshot object
		
	WebElement featuredproducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']")); // locate the element
		
		File scr1 = featuredproducts.getScreenshotAs(OutputType.FILE); // capture the screenshot
		
		File trg1 = new File("C:\\Users\\user\\Dropbox\\PC\\Documents\\Eclipse Workspace Folder\\Webdrivermavenproject\\Screenshot1\\featuredproducts.png"); // create a folder to save the screenshot and copy and paste the location
		
		FileUtils.copyFile(scr1, trg1); // copy the screenshot scr1 (source file) to the folder(target file)
		
		
		// capture the screenshot of logo element
		
		File scr2 = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).getScreenshotAs(OutputType.FILE);
		
		File trg2 = new File("C:\\Users\\user\\Dropbox\\PC\\Documents\\Eclipse Workspace Folder\\Webdrivermavenproject\\Screenshot1\\logo.png");
		
		FileUtils.copyFile(scr2, trg2);
		



	}

}
