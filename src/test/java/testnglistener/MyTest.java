package testnglistener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test(priority=1)
	void Test1()
	{
		Assert.assertEquals(1,1); // pass
	}

	@Test(priority=2)
	void Test2()
	{
		Assert.assertEquals("A", "B"); // fail
	}
	
	@Test(priority=3, dependsOnMethods = {"Test2"})
	void Test3()
	{
		Assert.assertEquals(1, 1); // skipped
	}
	
	
	
	
	
	
	
	
	
	
}
