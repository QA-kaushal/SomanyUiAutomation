package Android;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class RedumptionFlowPage {
	
	AndroidDriver driver;
	
	@FindBy(xpath="//*[contains(@content-desc,'Rewards')]")
	private WebElement Rewards;
	
	@FindBy(xpath="//*[contains(@content-desc,\"Search\")]")
	private WebElement search;
	
	@FindBy(xpath="(//android.widget.EditText)[1]")
	private WebElement SEARCH_By_Text;
		
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Category\"]")
	private WebElement Filerby_Category;
	
	@FindBy(xpath= "(//android.widget.ImageView)[1]")
	private WebElement clearFilter;
	
	@FindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement applyfilter;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"Gift Card\"]")
	private WebElement Gift_Card;
	
	@FindBy(xpath ="//android.view.View[@content-desc=\"Electronics\"]")
	private WebElement Electronics;
	
	@FindBy(xpath = "(//android.widget.ImageView)[4]")
	private WebElement Select_1Product;
	
	@FindBy(xpath="//*[contains(@content-desc,\"Add To Cart\")]")
	private WebElement Add_to_cart;
	
	@FindBy(xpath="//*[contains(@content-desc,\"Back\")]")
	private WebElement back;
		
	@FindBy(xpath = "(//android.widget.ImageView)[5]")
	private WebElement Select_2Product;
	
	@FindBy(xpath="(//android.widget.ImageView)[5]")
	private WebElement Increase_Quantity;
	
	@FindBy(xpath="(//android.widget.ImageView)[4]")
	private WebElement Decrease_Quantity;

	@FindBy(xpath="(//android.view.View)[17]")
	private WebElement delete_1_product;
	
	@FindBy(xpath= "(//android.view.View)[11]")
	private WebElement Product_Description;
	
	@FindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement cart;
	
	@FindBy(xpath= "//android.widget.ImageView[@content-desc=\"Place Order\"]")
	private WebElement Place_Order;
	
	@FindBy(xpath = "(//android.view.View)[18]")
	private WebElement addSameProduct;
	
	@FindBy(xpath = "(//android.view.View)[16]")
	private WebElement Remove_product;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"Shipping Address\"]")
	private WebElement Shipping_Address_Tital;
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"Submit\"]")
	private WebElement Submit_Redumption;
	
	@FindBy(xpath= "//android.view.View[@content-desc=\"Order Status\"]")
	private WebElement Order_Status_Tital;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"Your Order has been placed!\"]")
	private WebElement Message;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Order Status\"]")
	private WebElement Order_Status;
	
	@FindBy(xpath="(//android.view.View)[8]")
	private WebElement product;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"Order History\"]")
	private WebElement Order_History;
	
	@FindBy(xpath= "//android.widget.ImageView[@content-desc=\"Account Statement\"]")
	private WebElement Account_Statement;

	@FindBy(xpath = "//android.view.View[contains(@clickable,'true')]")
	   private List<WebElement> clickableElements;
	
	@FindBy(xpath="(//android.view.View)[9]")
	private WebElement cartIcon_Count;
	
	@FindBy(xpath="(//android.widget.ImageView)[3]")
	private WebElement SA_MobileNumber;
	
	@FindBy(xpath="(//android.widget.ImageView)[4]")
	private WebElement SA_Email;
	
	@FindBy(xpath="(//android.widget.ImageView)[5]")
	private WebElement SA_adress;
	
	@FindBy(xpath="(//android.widget.ImageView)[6]")
	private WebElement SA_State;
	
	@FindBy(xpath="(//android.widget.ImageView)[7]")   //have to scroll completely
	private WebElement SA_District;
	
	@FindBy(xpath="(//android.widget.ImageView)[7]")   //have to scroll completely
	private WebElement SA_PINCODE;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"OK\"]")
	private WebElement OK;
	
	@FindBy(xpath="(//android.view.View)[8]")
	private WebElement Redumption;
	
	public void Redumption() {
		Redumption.click();
	}
	
	public void getIncrease_Quantity() {
		 Increase_Quantity.click();
	}
	
	public void delete_1_product_fromCart() {
		delete_1_product.click();	
    }
	

	public void getDecrease_Quantity() {
		 Decrease_Quantity.click();
	}
	
	public void ok() {
		OK.click();

	}
	

	public void getSA_MobileNumber(String MobNum) {
		 SA_MobileNumber.click();
		 SA_MobileNumber.clear();
		 SA_MobileNumber.sendKeys(MobNum);
		 
	}
	
	public void getSA_Email(String email) {
		 SA_Email.click();
		 SA_Email.clear();
		 SA_Email.sendKeys(email);
		 
	}

	public void getSA_adress() {
		 SA_adress.click();
		 SA_adress.clear();
		 SA_adress.sendKeys("IN MY AUTOMATION WORLD");
		
	}

	public void getSA_State() {
		 SA_State.click();
	}

	public void getSA_District() {
		 SA_District.click();
	}

	public void getSA_PINCODE() {
		 SA_PINCODE.click();
	}
	
	public void clickFirstOptionInDropdown(int num) {
	    if (!clickableElements.isEmpty()) {
	        clickableElements.get(num).click();
	    }
      }
	
	public  void getCartIconCount() {
		    String count = cartIcon_Count.getAttribute("content-desc");
		    System.out.println("number of product " + count);
		}


	public void getRewards() {
		Rewards.click();
	}
	
	

	public void getSearch() {
		search.click();
	}

	public void getSEARCH_By_Text(String productname) {
		 SEARCH_By_Text.sendKeys(productname);
	}

	public void getFilerby_Category() {
		 Filerby_Category.click();
	}

	public void getClearFilter() {
		clearFilter.click();
	}

	public void getApplyfilter() {
		 applyfilter.click();
	}

	public void getGift_Card() {
		Gift_Card.click();
	}

	public void getElectronics() {
		Electronics.click();
	}

	public void getSelect_1Product() {
		 Select_1Product.click();
	}

	public void getAdd_to_cart() {
		 Add_to_cart.click();
	}

	public void getBack() {
		back.click();
	}

	public void getSelect_2Product() {
		Select_2Product.click();
	}

	public void getCart() {
		 cart.click();
	}

	public void getPlace_Order() {
		 Place_Order.click();
	}

	public void getAddSameProduct() {
		addSameProduct.click();
	}
	
	public String getProduct_Description() {
		return  Product_Description.getAttribute("content-desc");
	}


	public void getRemove_product() {
		Remove_product.click();
	}

	public String getShipping_Address_Tital() {
		return Shipping_Address_Tital.getAttribute("content-desc");
	}

	public void getSubmit_Redumption() {
		 Submit_Redumption.click();
	}

	public String getOrder_Status_Tital(String Tital) {
		return Order_Status_Tital.getAttribute("content-desc");
		
	}
	

	public void getMessage(String MSG) {
		MSG= Message.getText();
		System.out.println(MSG);
	}

	public void getOrder_Status() {
		 Order_Status.click();
	}

	public void getProduct() { 
		 product.click();
	}

	public void getOrder_History() {
		 Order_History.click();
	}

	public void getAccount_Statement() {		
		 Account_Statement.click();
	}
	
	public  String ScreenShot(String testCaseName, AppiumDriver driver) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"//screenshots"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

	}
	

	
	
}
