package assertionstestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
//	@Test
	void hard_assertion()
	{
		
	String s1="abc";
	String s2="abc";
	
	Assert.assertEquals(s1, s2,"s1 is not equal to s2");
	
//	Assert.assertNotEquals(s1, s2);
	
	System.out.println("hard assertion is completed...");
	
	}
	
	@Test
	void soft_assertion()
	{
		String s3="xyz";
		String s4="xyz1";
		
		SoftAssert sa= new SoftAssert();
		
		sa.assertEquals(s3, s4);
		
		
		System.out.println("soft assertion is completed...");
		
		sa.assertAll(); // mandatory
		
		
		
		
	}
	
	
	
	
	

}
