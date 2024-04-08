package pageobjectmodel;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerManager implements ITestListener
{
	public ExtentSparkReporter sparkReporter;  // This class will handle the UI of the report, eg, colour, size etc
	public ExtentReports extent;  // This class will populate common info on the report. eg, suite, browser, operating system, time, date, name of tester etc
	public ExtentTest test; // creating test case entries in the report and update status of the test methods. eg, failed test cases, passed test, skipped test etc

	public void onStart(ITestContext context) {
			
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReport1.html");//specify location of the report
		
		sparkReporter.config().setDocumentTitle("Automation Test Report"); // TiTle of report
		sparkReporter.config().setReportName("Functional Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.STANDARD); // theme can dark or standard
		
		extent=new ExtentReports(); // create extent object
		extent.attachReporter(sparkReporter); // attach extent object to sparkReporter
		
		extent.setSystemInfo("Computer Name","localhost"); // pass the required data
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","Henry Agulanna");
		extent.setSystemInfo("os","Windows10");
		extent.setSystemInfo("Browser name","Chrome,Firefox,Edge");
					
	}


	public void onTestSuccess(ITestResult result) 
	{
		
		test = extent.createTest(result.getName()); // create a new entry in the report
		test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status of the test (pass, fail, skip)
		
	}

	public void onTestFailure(ITestResult result) 
	{
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); // displays reason for the failure/error message
					
	}

	public void onTestSkipped(ITestResult result) 
	{

		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
		
	}

	
	public void onFinish(ITestContext context) 
	{
		
		extent.flush();
	}
		

	
	
	
	
	

}
