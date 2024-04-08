package annotaiontestng;

import org.testng.annotations.*; // add * to import all the annotations

public class BeforeAndAfterMethod {
	
	@BeforeMethod
	void login()
	{
		System.out.println("login...");
	}
	
	@Test(priority=1)
	void search()
	{
	  System.out.println("searching...");
	}
	
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("advancedsearch...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout...");
	}
	
	

}
