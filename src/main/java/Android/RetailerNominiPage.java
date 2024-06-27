package Android;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class RetailerNominiPage   {
	
	AndroidDriver driver;
	
	  @FindBy(xpath= "//*[@content-desc=\"My Retailers\"]")
	    private WebElement My_Retailer ;
	  
	  @FindBy(xpath= "//*[contains(@content-desc,'Add retailers')]")
	    private WebElement Add_retailer;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Member Type')]")
	    private WebElement Member_Type ;
	  
	  @FindBy(xpath= "//android.widget.Button[@content-desc='OK']") 
	   private WebElement OK;
	  
	  @FindBy(xpath="//android.widget.Button[@content-desc=\"OK\"]")
	  private WebElement okay;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Full Name')]")
	    private WebElement Full_name ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Mobile Number')]") 
	    private WebElement  Mobile_Number;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Firm Name')]")
	    private WebElement Firm_Name ; 
	  
	  @FindBy(xpath= "//*[contains(@text, 'Designation')]")
	    private WebElement Designation ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Email ID')]")
	    private WebElement Email_ID ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'PAN Number')]")
	    private WebElement PAN ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Date of Birth')]")
	    private WebElement Date_of_Birth  ;
	  
	  @FindBy(xpath= "//*[@content-desc=\"Switch to input\"]")
	    private WebElement edit  ;
	 
	  @FindBy(xpath= "//*[contains(@text, 'Enter Date')]")
	    private WebElement Enter_Date  ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Preferred Language')]")
	    private WebElement Language  ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Distributor Name')]")
	    private WebElement Distributor_Name ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Region')]")
	    private WebElement Region;
	  
	  @FindBy(xpath= "//*[contains(@text, 'State')]")
	    private WebElement state ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'District/City')]")
	    private WebElement District_City ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Pin')]")
	    private WebElement Pin_Code ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Address')]")
	    private WebElement Address ;
	  
	  @FindBy(xpath= "//*[contains(@text, 'Regional Business')]")
	    private WebElement Regional_Business ;
	  
	  @FindBy(xpath = "//android.view.View[contains(@clickable,'true')]")
	   private List<WebElement> clickableElements;
	  
	  @FindBy(xpath = "//*[contains(@text,'Remarks')]")
	   private WebElement Remarks;
	  
	  @FindBy(xpath = "//*[contains(@text,'Cancle')]")
	   private WebElement Cancle;
	  
	
	  @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Submit\"]")
	   private WebElement Submit;
	  
	  @FindBy(xpath= "//android.view.View[@content-desc='Choose Image']")
	   private WebElement Choose_Image;
	  
	  @FindBy(id= "com.google.android.documentsui:id/icon_thumb")
	   private WebElement Image;
	  
	   
	  @FindBy(id= "com.google.android.documentsui:id/action_menu_select")
	   private WebElement select;
	  
	  @FindBy(id= "Pending Nominations")
	   private WebElement Pending_Nominations;
	  
	  public void Pending_Nominations() {
		  Pending_Nominations.click();
	  }
	
	  public void My_Retailer() {
		 My_Retailer.click();
	}

	public void Add_retailer() {
		 Add_retailer.click();
	}


	public void Member_Type() {		
		 getMember_Type().click();
	}
	public WebElement getMember_Type() {
		return Member_Type;
	}
	
	public void OK() {
		 OK.click();
	}

	public void Full_Name(String text) {
		Full_name.click();
		 Full_name.sendKeys(text);
	}

	public void Mobile_Number(String mob) {
		 Mobile_Number.click();
		 Mobile_Number.sendKeys(mob);
	}

	public void Firm_Name(String firm) {
		 Firm_Name.click();
		 Firm_Name.sendKeys(firm);
	}

	public void Designation() {
		 Designation.click();
	}

	public void Email_ID(String email) {
		 Email_ID.sendKeys(email);
	}

	public void PAN(String pan) {
		 PAN.sendKeys(pan);   
	}

	public void Date_of_Birth(String date) {
		 Date_of_Birth.sendKeys(date);
	}
	
	public void edit() {
		edit.click();
	}
	
	public void Enter_Date(String date) {
		Enter_Date.sendKeys(date);
	}

	public void Language() {
		 Language.click();
	}

	public void Distributor_Name() {
		 Distributor_Name.click();
	}

	public void Region() {
		 Region.click();
	}

	public void State() {
		 state.click();
	}

	public void District_City() {
		 District_City.click();
	}

	public void Pin_Code() {
		 Pin_Code.click();
	}

	public void Address(String adress) {
		Address.click();
		 Address.sendKeys(adress);
	}

	public void Regional_Business(String a) { 
		 Regional_Business.sendKeys(a);
	} 
	
	public void remarks() {
		Remarks.sendKeys("okay");
	}
	
	public void submit() {
		Submit.click();
	}
	
	public void cancle() {
		Cancle.clear();
	}
	public void clickFirstOptionInDropdown(int num) {
	    if (!clickableElements.isEmpty()) {
	        clickableElements.get(num).click();
	    }
      }
	
	public void Choose_Image() {
		 Choose_Image.click();
	}

	public void Image() {
		 Image.click();
	}
	
	public void seclect() {
       select.click();
	}

	
	}
