package mouseoperationhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo1 {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		// locate the source and target elements (source = Rome, target = Italy)
		
		WebElement Rome = driver.findElement(By.xpath("//div[@id='box6']"));
		
		WebElement Italy = driver.findElement(By.xpath("//div[@id='box106']"));
		
		// create Actions class object
		
		Actions acts = new Actions(driver);
		
		// drag the source and drop it on the target
		
		acts.dragAndDrop(Rome, Italy).perform();
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
