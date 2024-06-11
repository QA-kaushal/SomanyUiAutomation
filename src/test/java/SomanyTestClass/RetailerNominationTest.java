package SomanyTestClass;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import Android.AndroidActions;


public class RetailerNominationTest extends BaseTest {
		 
	
	@Test(priority=0,groups="f1")
	 public void Pending_Nominations() {
	 np.Pending_Nominations();
		}
		
	
	@Test(priority=1,groups = { "retailer", "f1" })	
	public void My_retailer() throws InterruptedException {
		
		Thread.sleep(1000);
		np.My_Retailer();
	}
	 
	@Test(priority=2,groups = { "retailer", "f1" })		
	public void Add_retailer() {
		np.Add_retailer();
		
	}
	
	@Test(priority=3,groups = { "retailer", "f1" })
	public void member_Type() throws InterruptedException {
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, 'Member Type')]")));
		np.Member_Type();
		Thread.sleep(2000);
		np.clickFirstOptionInDropdown(0);
		Thread.sleep(3000);
		np.OK();
	}
	
	@Test(priority=4,groups = { "retailer", "f1" })
	public void Full_Name() throws InterruptedException {
	AndroidActions ac = new AndroidActions(driver);
	ac.scrollAndClick("Full");
	Thread.sleep(2000);
		np.Full_Name("kaushal");
		Thread.sleep(3000);
		driver.hideKeyboard();
		   Thread.sleep(2000);
	}
	
	@Test(priority=5,groups = { "retailer", "f1" })
	public void mobile_number() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("Mobile");
		Thread.sleep(2000);
		np.Mobile_Number("9651918600");
		
		driver.hideKeyboard();
		   Thread.sleep(2000);
	}
	
	@Test(priority=6,groups = { "retailer", "f1" })
	public void firm_name() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("Firm");
		Thread.sleep(2000);
       np.Firm_Name("kaushal enterprices");
    
       driver.hideKeyboard(); 
       Thread.sleep(2000);
	}

	@Test(priority=7,groups = { "retailer", "f1" })
	public void designation() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("Designation");
		Thread.sleep(2000);
		np.clickFirstOptionInDropdown(0);
		Thread.sleep(2000);
		np.OK();

	}
	@Test(priority=8,groups = { "retailer", "f1" })
	public void profile_photo() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		Thread.sleep(2000);
		ac.tapOnScreen(driver, 225, 2509);
		np.Choose_Image();
		Thread.sleep(2000);
		np.Image();
		Thread.sleep(2000);
		//np.seclect();
	}
	
	@Test(priority=9,groups = { "retailer", "f1" })
	public void Email_ID() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		wait.until(ExpectedConditions.visibilityOf(np.getMember_Type()));
		ac.scrollAndClick("Email ID");
		np.Email_ID("kaushal@gmail.com");
		driver.hideKeyboard(); 
		Thread.sleep(2000);
	}
	
	@Test(priority=10,groups = { "retailer", "f1" })
	public void PAN_Numbaer() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("PAN Number");
		Thread.sleep(3000);
		np.PAN("DOPLH1256T");
		Thread.sleep(3000);
		driver.hideKeyboard();
		Thread.sleep(3000);
		ac.scrollToDown(5);
	}
	
	@Test(priority=11,groups = { "retailer", "f1" })
	public void PAN_image() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.tapOnScreen(driver,219,2093);
		np.Choose_Image();
		Thread.sleep(2000);
		np.Image();
		Thread.sleep(3000);
	//	np.seclect();
	}

	@Test(priority=12,groups = { "retailer", "f1" })
	public void Date_of_Birth() {
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("Date of Birth");
		
		
	}
	
	@Test(priority=13,groups = { "retailer", "f1" })
	public void edit() {
		np.edit();
	}
	
	@Test(priority=14,groups = { "retailer", "f1" })
	public void Enter_Date() {
		np.Enter_Date("03/11/2000");
	}
	
	@Test(priority=15,groups = { "retailer", "f1" })
	public void ok() throws InterruptedException {
		np.OK();
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollToDown(3);
		
		ac.scrollAndClick("Preferred Language");
		np.clickFirstOptionInDropdown(0);
		Thread.sleep(2000);
		np.OK();
	}
	
	@Test(priority=16,groups = { "retailer", "f1" })
	public void Distributor_Name() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("Distributor Name");
		np.clickFirstOptionInDropdown(0);
		Thread.sleep(1000);
		np.OK();
		ac.scrollToDown(3);
	}
	   @Test(priority=17,groups = { "retailer", "f1" })
		public void Adrerss() throws InterruptedException {
			AndroidActions ac = new AndroidActions(driver);
			//ac.scrollToDown((float) 1.3);
			ac.scrollAndClick("Address");
			np.Address("assam bust stand 2/78");
			driver.hideKeyboard(); 
			   Thread.sleep(2000);
		}
	
	@Test(priority=18,groups = { "retailer", "f1" })
	public void Region() throws InterruptedException {	
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("Region");
		Thread.sleep(2000);
		np.clickFirstOptionInDropdown(0);
		Thread.sleep(1000);
		np.OK();
	}
	
	@Test(priority=19,groups = { "retailer", "f1" })
	public void State() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("State");
		Thread.sleep(2000);
		np.clickFirstOptionInDropdown(0);
		Thread.sleep(1000);
		np.OK();
	}
	
	@Test(priority=20,groups = { "retailer", "f1" })
	public void District_City() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("District/City");
		Thread.sleep(2000);
		np.clickFirstOptionInDropdown(0);
		np.OK();
	}
	
	@Test(priority=21,groups = { "retailer", "f1" })
	public void pinCode() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("Pin");
		Thread.sleep(2000);
		np.clickFirstOptionInDropdown(0);
		Thread.sleep(1000);
		np.OK();
	}
	   
    @Test(priority=22,groups = { "retailer", "f1" })
	public void Regional_Business_manager() throws InterruptedException {
    	AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("Business Manager");
		np.Regional_Business("abc");
		driver.hideKeyboard();
		   Thread.sleep(2000);
	}
    
    @Test(priority=23,groups = { "retailer", "f1" })
    public void Remark() throws InterruptedException {
    	AndroidActions ac = new AndroidActions(driver);
		ac.scrollAndClick("Remarks");
		np.remarks();
		
		driver.hideKeyboard();
		   Thread.sleep(2000);
	}
   
    
  
    @Test(priority=24,groups = { "retailer", "f1" })
	public void Visiting_card() throws InterruptedException {
    	AndroidActions ac = new AndroidActions(driver);
		ac.tapOnScreen(driver,225,530);
		np.Choose_Image();
		Thread.sleep(2000);
		np.Image();
		Thread.sleep(2000);
	}
	@Test(priority=25,groups = { "retailer", "f1" })
	public void owner_photo() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.tapOnScreen(driver,225,1029);
		np.Choose_Image();
		Thread.sleep(2000);
		np.Image();
		Thread.sleep(2000);
	}
	@Test(priority=26,groups = { "retailer", "f1" })
	public void shope_photo() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.tapOnScreen(driver, 231,1536);
		np.Choose_Image();
		Thread.sleep(2000);
		np.Image();
		Thread.sleep(2000);
	}
	@Test(priority=27,groups = { "retailer", "f1" })
	public void GST_certificate() throws InterruptedException {
		AndroidActions ac = new AndroidActions(driver);
		ac.tapOnScreen(driver,225,2036);
		np.Choose_Image();
		Thread.sleep(2000);
		np.Image();
		Thread.sleep(2000);
	}
	
	  @Test(priority=28,groups = { "retailer", "f1" })
	    public void submit() {
	    	np.submit();
	    }
	  
		@Test(priority=29,groups="retailer")
		public void scrollbit() {
			AndroidActions ac = new AndroidActions(driver);
			ac.scrollToDown(5);
		}
		
		@Test(priority=30,groups="retailer")
		public void back() throws InterruptedException {
			Thread.sleep(2000);			  
			driver.navigate().back();	
		}	
	}
