package annotaiontestng;

import org.testng.annotations.*;


public class BeforeClassAndAfterClass {
	
	@BeforeClass
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
	
	@AfterClass
	void logout()
	{
		System.out.println("logout...");
	}

}
