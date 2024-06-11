package SomanyTestClass;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listeners implements ITestListener  {
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
	        String host = "smtp.sendgrid.net";
	        String port = "587";
	        String mailFrom = "kaushalautomation1@gmail.com";
	        String password = "wcdihoioftccdupa";
	        
	        // Recipients
	        String mailTo = "kaushal.golangade@channelplay.in";
	        String subject = "ExtentReports - TestNG Execution Report";
	        String message = "Please find the attached test execution report.";
	        String attachFiles = "extent.html";

	        try {
	            EmailUtil.sendEmailWithAttachment(host, port, mailFrom, password, mailTo,
	                                              subject, message, attachFiles);
	            System.out.println("Email sent successfully.");
	        } catch (AddressException ex) {
	            ex.printStackTrace();
	        } catch (MessagingException ex) {
	            ex.printStackTrace();
	        }
	    }
	    }

	 
	
	