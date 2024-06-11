package Android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
			 AndroidDriver driver;
			 
		    @FindBy(xpath= "//android.widget.ImageView[@content-desc='Account Statement']")
		    private WebElement Account_Statement ;
		    
		    @FindBy(xpath= "//android.widget.ImageView[@content-desc='Rewards']")
		    private WebElement Rewards ;
		    
		    @FindBy(xpath= "//android.widget.ImageView[@content-desc='Transactions']")
		    private WebElement Transactions ;
		    
		    @FindBy(xpath= "(//android.widget.ImageView)[2]")
		    private WebElement side_menu ;
		    
		    @FindBy(xpath= "//android.view.View[contains(@content-desc, 'Points Earned')]")
		    private WebElement Points_Earned  ;
		    
		    @FindBy(xpath= "//android.view.View[contains(@content-desc,'Points Balance')]")
		    private WebElement Points_Balance ;
		    
		    @FindBy(xpath= "//android.view.View[contains(@content-desc,'Transactions')]")
		    private WebElement Transactions_points ;
		    
		    @FindBy(xpath= "//android.view.View[contains(@content-desc,'Redeemed Points')]")
		    private WebElement Redeemed_Points ;


			public void Account_Statement() {
			 Account_Statement.click();
			}

			public void Rewards() {
				 Rewards.click();
			}

			public void Transactions() {
				 Transactions.click();
			}

			public void Side_menu() {
				 side_menu.click();
			}

			public void Points_Earned() {
				 Points_Earned.click();
			}

			public void Points_Balance() {
				 Points_Balance.click();
			}

			public void Transactions_points() {
				 Transactions_points.click();
			}

			public void Redeemed_Points() {
				 Redeemed_Points.click();
			}
	    
	}


