package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener // press Ctrl key, take your cursor to the ITestListener and click on open declaration to see the interface implementation. Copy and paste the required methods
{
	public void onTestStart(ITestResult result) // change the method to public. result=variable which captures or contains the result of the test, ITestResult = result type
	{
	    System.out.println("on test start...");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		 System.out.println("on test success...");
	}
	
	public void onTestFailure(ITestResult result)
	{
		 System.out.println("on test failure...");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		 System.out.println("on test skipped...");
	}
	
	public void onFinish(ITestContext context)
	{
		 System.out.println("on test finish...");
	}
	
	
	
	
	
	
}
