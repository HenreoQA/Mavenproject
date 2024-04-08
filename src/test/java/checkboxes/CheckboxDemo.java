package checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().window().maximize();
		
		// How to select a specific one checkbox
		
	//	driver.findElement(By.xpath("//input[@value='red']")).click();
		
		
		// How to capture the total number of checkboxes
		
	List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
	System.out.println("total number of checkboxes:"+checkboxes.size());
	
	
	// How to select all the checkboxes at once using looping statement(normal or enhanced for loop)
	// Note: You have to capture total number of checkboxes before selecting them
	
	
	// Using normal for loop
	
/*	for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	} */
	
	
	// Using enhanced for loop
	
/*	for(WebElement ch:checkboxes)
	{
		ch.click();
	} */
	

	// How to select last two of the checkboxes using normal for loop (enhanced for loop is not applicable b/c index is needed)
	
	// Total number of checkboxes - number of checkboxes to be selected = starting index
	// 6-2=4(starting index)
	
/*	for(int i=4;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	} */
	
	
	// How to select first two of the checkboxes using for loop
	
	// Approach1
	
/*	 for(int i=0; i<2; i++)
	{
		checkboxes.get(i).click();
	} */
	
	// Approach2
	
/*	for(int i=0;i<checkboxes.size();i++)
	{
		if(i<2)
		checkboxes.get(i).click();
	} */
	
	
	// How to uncheck or unselect all the checkboxes using looping statement
	
	// Using normal for loop
	
/*	for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}
	
	for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	} */
	
	// Using enhanced for loop
	
	//Approach1
	
/*	for(WebElement ch:checkboxes)
	{
		ch.click();
	}
	
	for(WebElement ch:checkboxes)
	{
		ch.click();
	} */
	
	// Approach2
	
/*	for(WebElement ch:checkboxes)
	{
		ch.click();
	}
	
	for(WebElement ch:checkboxes)
	{
		if(ch.isSelected());
		ch.click();
	} */
	
	
	// How to uncheck a specific checkbox using looping statement
	
	// Approach1
	
/*	driver.findElement(By.xpath("//input[@value='red']")).click();
	
    driver.findElement(By.xpath("//input[@value='red']")).click(); */
	
	// Approach2
	

/*	for(int i=0; i<1; i++)
	{
		checkboxes.get(i).click();
	} 
	 
	 for(int i=0; i<1; i++)
		{
		 if(checkboxes.get(i).isSelected());
			checkboxes.get(i).click();
		} */
	
	
	// Approach3
	
/*	driver.findElement(By.xpath("//input[@value='red']")).click();
	
	if(driver.findElement(By.xpath("//input[@value='red']")).isSelected());
	
	driver.findElement(By.xpath("//input[@value='red']")).click(); */
	
	
	
	// How to unselect or uncheck the first two checkboxes using normal for loop
	
	 for(int i=0; i<2; i++)
	{
		checkboxes.get(i).click();
	} 
	 
	 for(int i=0; i<2; i++)
		{
		 if(checkboxes.get(i).isSelected());
			checkboxes.get(i).click();
		} 
	
	
	
	
	
	
	
	
	
	
	
	
	 
		
		

	}

}
