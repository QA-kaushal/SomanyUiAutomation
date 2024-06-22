package SomanyTestClass;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class Listeners  implements ITestListener  {



	AndroidActions act = new AndroidActions(null);
AppiumDriver driver;
	ExtentTest test;
ExtentReports extent = ExtenetReporterNG.getreporterObject();

	
	    @Override
	    public void onTestStart(ITestResult result) {
		 test= extent.createTest(result.getMethod().getMethodName());
	    }
 
	    @Override
	    public void onTestSuccess(ITestResult result) {
	       test.log(Status.PASS, "Testcase Passesd") ;
	      
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	    	test.log(Status.FAIL, result.getThrowable());
	    	try {
				driver=(AppiumDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	try {
				test.addScreenCaptureFromPath(act.getScreenShot(result.getMethod().getMethodName(), driver), result.getMethod().getMethodName());
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	       
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	          
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	       extent.flush();
	       // Send the report via email
	    }
	    }
	 
	
	