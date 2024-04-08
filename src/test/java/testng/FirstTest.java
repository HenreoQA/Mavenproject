package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest 
{
   // @BeforeClass 
	 @Test(priority=1)
	void Test1()
	{
		System.out.println("Testing1");
	}
	
      
      @Test(priority=2)
	void Test2()
	{
       System.out.println("Testing2");
	}
      
  //  @AfterClass
       @Test(priority=3)
	void Test3()
	{
    	System.out.println("Testing3");
	}









}
