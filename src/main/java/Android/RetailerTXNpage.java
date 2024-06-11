 package Android;

import java.io.File;
import java.io.IOException;
import java.util.List;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class RetailerTXNpage {
   AndroidDriver driver;
      
   @FindBy(xpath= "//android.widget.ImageView[@content-desc='Transactions']")
   private WebElement Transactions ;
   
   @FindBy(xpath= "//*[@content-desc='Pending Transactions']")
   private WebElement pending_Transactions ;
   
   @FindBy(xpath= "//*[contains(@content-desc, 'Add transaction')]") 
   private WebElement Add_Transaction;
   
   @FindBy(xpath= "(//android.widget.ImageView)[2]")
   private WebElement Retailer_Name;
   
   @FindBy(xpath = "//android.view.View[contains(@clickable,'true')]")
   private List<WebElement> clickableElements;
   
   @FindBy(xpath= "(//android.widget.ImageView)[3]")
   private WebElement Distributor_Name;
   
   @FindBy(xpath= "(//android.widget.ImageView)[4]")
   private WebElement Invoice_Date;
   
   @FindBy(xpath= " //android.widget.Button[@content-desc='Switch to input']")
   private WebElement Invoice_DateEdite;
   
   @FindBy(xpath= "//*[contains(@text,'Enter Date')]") 
   private WebElement Invoice_DatePass;                                                                       //Format=  mm/dd/yyyy
   
   @FindBy(xpath= " //android.widget.Button[@content-desc='OK']") 
   private WebElement OK;
   
   @FindBy(xpath= " //android.widget.Button[@content-desc='CANCEL']") 
   private WebElement CANCEL;
   
   @FindBy(xpath= "//*[contains(@text, 'Invoice Number')]")
   private WebElement  Invoice_Number;
   
   @FindBy(xpath= "//*[@content-desc=\"Products\"]/android.view.View/android.widget.ImageView")
   private WebElement Add_products;
   
   @FindBy(xpath= "(//android.widget.ImageView)[2]")
   private WebElement  Product_Select;
   
   @FindBy(xpath= "//android.widget.ImageView[@content-desc='MRP']")
   private WebElement MRP;                                              //use this for get text means price for verification
   
   @FindBy(xpath= "(//android.widget.ImageView)[4]")
   private WebElement Strips ;
   
   @FindBy(xpath= "(//android.widget.ImageView)[5]")
   private WebElement price_to_retailer;
   
   @FindBy(xpath= "(//android.widget.ImageView)[6]")
   private WebElement  Subtotal;                                     //use this for get text means price for verification
   
   @FindBy(xpath= "(//android.widget.ImageView)[8]")
   private WebElement Save;
   
   @FindBy(xpath= "//android.view.View[@content-desc='Choose Image']")
   private WebElement Choose_Image;
  
   @FindBy(id= "com.google.android.documentsui:id/icon_thumb")
   private WebElement Image;
   
 @FindBy(xpath= "//android.widget.ImageView[@content-desc=\"Submit\"]")
   private WebElement submit;
 
 @FindBy(xpath= "//android.widget.ImageView[@content-desc='Approve']")
 private WebElement Approve;
 
 @FindBy(xpath= "//android.widget.ImageView[@content-desc='Reject']")
 private WebElement reject;
 
 @FindBy(xpath= "//*[@content-desc='Cancel']")
 private WebElement TXN_cancel;

 @FindBy(xpath= "//android.widget.ImageView[contains(@content-desc, 'Back')]")
 private WebElement Back;
 
 @FindBy(xpath= "(//android.widget.ImageView)[2]")
 private WebElement side_menu;
 
 @FindBy(xpath= "//android.widget.ImageView[@content-desc=\"Logout\"]")
 private WebElement Logout;
 
 @FindBy(xpath= "//*[contains(@text,\"Pre GST invoice amount\")]")
 private WebElement Pre_GST_invoice_amount;
 
 @FindBy(xpath="(//*[contains(@content-desc,\"Transaction ID\")]/*[2])[1]")
 private WebElement action;
 
 
 public void Logout() {
	 Logout.click();
 }
 
 public void side_menu() {
	 side_menu.click();
 }
 
 public WebElement Back() {
	 return Back;
 }
 
public  WebElement Transactions() {
	return Transactions; 
}

public WebElement  Add_Transaction() {
	return  Add_Transaction;
}

public WebElement Retailer_Name() {
	return Retailer_Name;	 
}

public WebElement Distributor_Name() {
	return  Distributor_Name;
}

public  void Invoice_Date() {
	 Invoice_Date.click();
}

public void Invoice_DateEdite() {
	 Invoice_DateEdite.click();
}

public void Invoice_DatePass(String Date) {
	 Invoice_DatePass.sendKeys(Date);
}

public void OK() {
	 OK.click();
}

public void CANCEL() {
	 CANCEL.click();
}

public void Invoice_Number(String num) {
	Invoice_Number.click();
	Invoice_Number.sendKeys(num);
}

public void Add_products() {
	 Add_products.click();
}

public void Product_Select() throws InterruptedException {
	Thread.sleep(2000);
	 Product_Select.click();
}

public void MRP() {
	String mrp= MRP.getText();
	 System.out.println(mrp);
}

public void Purchase_Price(String price) {
	Strips.click(); 
	Strips.sendKeys(price);
}

public void Unit (String unit) {
	price_to_retailer.click();
	price_to_retailer.sendKeys(unit);	
}

public void Subtotal() {
	String subtotal= Subtotal.getText();
	System.out.println(subtotal);
}

public void Save() {
	 Save.click();
}

public void tapOnScreen( AndroidDriver driver, int x, int y) {
	TouchAction ta = new TouchAction(driver);
	ta.tap(PointOption.point(x, y)).perform();
}
public void Choose_Image() {
	 Choose_Image.click();
}

public void Image() {
	 Image.click();
}
public void clickFirstOptionInDropdown(int num) {
    if (!clickableElements.isEmpty()) {
        clickableElements.get(num).click();
    }
    
}

public void submit() {
	  submit.click();
}

public WebElement Pending_Transactions() {
	return pending_Transactions;
  }

public void approve() {
	Approve.click();
}

public void reject() {
	reject.click();
}

public void TXN_cancel() {
	TXN_cancel.click();
}

public void Pre_GST_invoice_amount(String amount) {
	Pre_GST_invoice_amount.click();
	Pre_GST_invoice_amount.sendKeys(amount);
}

public void action() {
	 action.click();
}

public  String ScreenShot(String testCaseName, AppiumDriver driver) throws IOException {
	File source = driver.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"//screenshots"+testCaseName+".png";
	//FileUtils.copyFile(source, new File(destinationFile));
	return destinationFile;

}
}
