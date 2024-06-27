package SomanyTestClass;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginTest extends BaseTest{
	
	@Test(priority=1,groups = {"retailer"},dataProvider="loginMOBno", dataProviderClass=DataInventory.class)
	public void mobileNumber(String mobNo) throws IOException, InterruptedException {
		System.out.println("hi");
		lp.Enter_MObNo(mobNo);
		System.out.println("mobi pass");
	     lp.getSend_OTP();
	     lp.Mob_clear();
	     
	}
	@Parameters({"User"}) 
	@Test(priority=1,groups = {"distributor","F1","F2"})
	public void DistributorNo(String mobNo) throws IOException, InterruptedException {
		System.out.println("hi");
		lp.Enter_MObNo(mobNo);
		System.out.println("mobi pass");
	     lp.getSend_OTP();
	     lp.Mob_clear();	    
	}
	
	@Test(priority=2,groups = { "retailer", "distributor","F1","F2" })
	public void sendOTP() throws IOException, InterruptedException {		
			 System.out.println("landed on OTP page");
   }

	@Test(priority=3,dataProvider="loginOTP",groups = { "retailer", "distributor","F1","F2" }, dataProviderClass=DataInventory.class)
	public void enterOTP(String OTP) throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc=\"Welcome\"]")));
		wait.until(ExpectedConditions.visibilityOf(lp.getEnter_OTP()));	
		lp.getEnter_OTP().click();
		Thread.sleep(2000);
		lp.getEnter_OTP().sendKeys(OTP);
		lp.getVerify_OTP();
		lp.OTP_clear();			 
	}
	
	@Test(priority=4,groups = { "retailer", "distributor","F1","F2" })
	public void submit() throws IOException, InterruptedException {
		
			  System.out.println("landed on Landing Screen");
	}
	
	@Test(priority=5,groups = { "retailer", "distributor","F1","F2" })
	public void resendOTP() throws IOException, InterruptedException {
		
			//  lp.getResend_OTP();
		System.out.println("reset otp passed");
	}
		
	
}
