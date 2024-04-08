package assertionstestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
		int a=10;
		
		int b=15;
		
	/*	if(a==b)
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		*/
		
	//	Assert.assertEquals(a, b);
		
	//	Assert.assertTrue(false);
		
		
		int x=20;
		
		int y=30;
		
	// Assert.assertEquals(actual, expected, description);
		
	//	Assert.assertEquals(x>y, true, "x is not greater than y");
		
		
		String s1="abc";
		String s2="abc";
		
	//	Assert.assertEquals(s1, s2,"s1 is not equal to s2");
		
		Assert.assertNotEquals(s1, s2);
		
		
		
		
		
		
	}






}
