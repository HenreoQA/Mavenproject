package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCase 
{
    WebDriver driver; // initiate the webdriver
    
//    LoginPageWithoutPageFactory lp; // create loginpage class object
    
      LoginPageUsingPageFactory lp; // create object using page factory
    
    @BeforeClass
    void setup()
    {
    	driver = new ChromeDriver();
    	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().window().maximize();
    
    }
    
    @Test(priority=1)
    void checklogo()
    {
    	lp = new LoginPageUsingPageFactory(driver); // pass driver object for constructor
    	lp.Checklogo(); // call checklogo method
    	
    	Assert.assertEquals(lp.Checklogo(), true);
    }
    
    @Test(priority=2)
    void login()
    {
    	lp.Setusername("Admin");
    	lp.Setpassword("admin123");
    	lp.Clicksubmit();
    	
    	driver.getTitle(); // get title page
    	
    	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
	
    @AfterClass
    void teardown()
    {
    	driver.close();
    }
	
	
	
	
	
	
	
	
	
}
