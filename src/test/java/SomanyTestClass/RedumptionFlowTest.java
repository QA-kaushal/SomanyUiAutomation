package SomanyTestClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service.State;

import Android.AndroidActions;

public class RedumptionFlowTest extends BaseTest{


	@Test(priority =1)
	public void Reward() {
		RF.getRewards();
	}
	
	@Test(priority =2)
	public void products() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@content-desc,\"Back\")]")));
        RF.getSearch();
	}
	
	@Test(priority =3)
	public void FilterBy() {
		RF.getFilerby_Category();
	}
	
	@Test(priority =4)
	public void dropdown() {
		RF.clickFirstOptionInDropdown(1);
		RF.getApplyfilter();
	}
	
	@Test(priority =5)
	public void product() {
        RF.getSelect_1Product();
	}
	
	@Test(priority =6)
	public void addtocart() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@content-desc,\"Add To Cart\")]")));
		RF.getAdd_to_cart();
	}
	
	@Test(priority=7)
	public void cart() {
		RF.getCart();
	}
	
	@Test(priority=8)
	  public void back() {
		RF.getBack();
		RF.getBack();
	}
	  
	@Test(priority=9)
	  public void searchForanotherProduct() {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@content-desc,\"Back\")]")));
	        RF.getSearch();
		}
	  
	  @Test(priority=10)
	  public void FilterForList() {
			RF.getFilerby_Category();
		}
			  
		@Test(priority =11)
		public void dropdownList() {
			RF.clickFirstOptionInDropdown(3);
			RF.getApplyfilter();
		}
		
		
		@Test(priority=12)
		public void AnotherProduct() {  
			RF.getSelect_2Product();
		}
		
		@Test(priority=13, invocationCount=4)
		public void QuantityIncrease() {
			RF.getIncrease_Quantity();
		}
		
		@Test(priority=14, invocationCount=3)
		public void QuantityDecrease() {
			RF.getDecrease_Quantity();
		}
		
		@Test(priority=15)
		public void AddanotherProducttocart() {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@content-desc,\"Add To Cart\")]")));
			RF.getAdd_to_cart();
		}
		@Test(priority=16)
		public void getCountfrom_CartIcon() {
			 RF.getCartIconCount();
			
		}
		
		@Test(priority=17)
		public void cart2() {
			RF.getCart();
		}
		
		@Test(priority=18)
		public void delete_1_product_fromCart() {
			RF.delete_1_product_fromCart();

		}
		
		@Test(priority=19)
		public void place_order() {
			RF.getPlace_Order();
		}
		
		@Test(priority=20)
		public void Shipping_adress() {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.view.View[@content-desc=\"Shipping Address\"]")));
		String Tital=RF.getShipping_Address_Tital();
		System.out.println("Tital of the page:"+ Tital);		
		Assert.assertEquals("Shipping Address", Tital);
		System.out.println("Assert Pass");
	
		}
		
		@Test(priority=21)
		public void Shipping_adressINFO() {
			System.out.println("landed on Shipping Adress Screen");
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.ImageView[@content-desc=\"Name\"]")));
			RF.getSA_MobileNumber("9021336929");
			driver.hideKeyboard();
			
		}
		@Test(priority=22)
		public void email() {
			RF.getSA_Email("everfire@gmail.com");
			driver.hideKeyboard();

		}
		@Test(priority=23)
		private void SAadress() {
			RF.getSA_adress();
			driver.hideKeyboard();			
		}
		
		@Test(priority=24)
		public void State() {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.ImageView[@content-desc=\"Submit\"]")));
			RF.getSA_State();
			RF.clickFirstOptionInDropdown(0);
			RF.ok();
		}
		@Test(priority=25)
		public void ScrollToDistrict() throws InterruptedException {
			AndroidActions ac = new AndroidActions(driver);
			ac.scrollToDown(2);
			Thread.sleep(2000);
		}
		@Test(priority=26)
		public void District() throws InterruptedException {
			Thread.sleep(2000);
			RF.getSA_District();
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")));
			RF.clickFirstOptionInDropdown(2);
			RF.ok();
			Thread.sleep(2000);
		}
		@Test(priority=27)
		public void ScrollToPINCODE() throws InterruptedException {
			AndroidActions ac = new AndroidActions(driver);
		
			ac.scrollToDown(2);
			Thread.sleep(2000);
		}
		
		@Test(priority=28)
		public void PINCODE() throws InterruptedException {
			Thread.sleep(2000);			
			RF.getSA_PINCODE();
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")));
			RF.clickFirstOptionInDropdown(1);
			RF.ok();
		}
		
		@Test(priority=29)
		public void submit_Redumption() {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.ImageView[@content-desc=\"Submit\"]")));
          RF.getSubmit_Redumption();
          
		}
		
		@Test(priority=30)
		public void order_placed() {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@content-desc=\"Order Status\"]")));
		System.out.println("Order has been placed");

		}
		
		@Test(priority=31)
		public void Order_Status() {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@content-desc=\"Order Status\"]")));
			RF.getOrder_Status();
		}
		
		@Test(priority=32)
		public void Oeder_HistoryScreen() {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("(//android.view.View)[8]")));
			System.out.println("Landed on Order History screen");

		}
		
		@Test(priority=33)
		public void OrderHistory() {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("(//android.view.View)[8]")));
			RF.getOrder_History();
		}
		
		@Test(priority=34)
		public void Redumption() {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("(//android.view.View)[8]")));
			RF.Redumption();

		}
		
		@Test(priority=35)
		private void OrederSummary() throws IOException {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.view.View[@content-desc=\"Order Summary\"]")));
			System.out.println("Landed on Order Summary Page");
			RF.ScreenShot("OrderSummay", driver);
		}
		
	  }
	

