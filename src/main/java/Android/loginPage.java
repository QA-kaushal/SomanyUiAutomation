package Android;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class loginPage {	  

	    @FindBy(xpath= "(//android.widget.EditText)[1]")
	    private WebElement Enter_MObNo ;
	    
	    @FindBy(xpath="//android.view.View[@content-desc='Send OTP']")
	    private WebElement Send_OTP ;
	    
	    @FindBy(xpath = "//android.widget.EditText")   
	    private WebElement Enter_OTP ;
	
	    @FindBy(xpath = "//android.view.View[@content-desc='Verify OTP']")
	    private WebElement  Verify_OTP;
	    
	    @FindBy(xpath = "//android.view.View[@content-desc='Resend OTP']")
	    private WebElement Resend_OTP ;


		public void  Enter_MObNo(String mobNo) throws InterruptedException {
		
			Enter_MObNo.click();
			Thread.sleep(2000);
			Enter_MObNo.sendKeys(mobNo);
			
		}

		public void getSend_OTP() throws InterruptedException {
			 Thread.sleep(4000);
			 Send_OTP.click();
			 
			
		}
		public void Mob_clear() throws InterruptedException {
			Enter_MObNo.click();
			Enter_MObNo.clear();		
		}
			
		 public WebElement getEnter_OTP() {
		        return Enter_OTP;
		    }
		 
		 public void OTP_clear() {
			 Enter_OTP.click();
				Enter_OTP.clear();
			}
		 
		
	
		public void  getVerify_OTP() {
			 Verify_OTP.click();
		}

		public void getResend_OTP() {
			 Resend_OTP.click();
		}

		

}
