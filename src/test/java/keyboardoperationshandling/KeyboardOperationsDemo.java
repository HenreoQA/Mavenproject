package keyboardoperationshandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperationsDemo {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get(" https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		
		// locate the element and insert text (Welcome to Automation)
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to Automation");
		
		// create Actions class object
		
		Actions act = new Actions(driver);
		
		// perform control A keyboard action
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		// perform control C keyboard action
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		// perform TAB action
		
	//	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform(); // use this if you want to perform single key operation
		
		// perform control V keyboard action
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		// perform backspace operation
		
		act.sendKeys(Keys.BACK_SPACE).perform();
		
		// perform space operation
		
		act.sendKeys(Keys.SPACE).perform();
		
		// perform ENTER operation
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
