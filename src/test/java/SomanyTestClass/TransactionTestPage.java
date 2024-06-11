package SomanyTestClass;

import java.io.IOException;

import java.util.NoSuchElementException;


import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.annotations.Test;

import Android.AndroidActions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

public class TransactionTestPage extends BaseTest {

	
		@Test(priority=1,groups = { "retailer"})
		public void transaction() throws IOException {
			
			System.out.println("was");   
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Transactions']")));
				  tp.Transactions().click();
		}
		
		@Test(priority=2,groups = {"distributor","F1","F2"})
		public void Pending_Transactions() {			
			  System.out.println("transaction screen");
			    tp.Pending_Transactions().click();		   
     	}
		
		@Test(priority=3,groups = { "retailer"})
		public void Add_Transaction() throws InterruptedException {
		tp.Add_Transaction().click();	
		}
		
		@Test(priority=4, groups= {"distributor","F1","F2"})
		public void action() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@content-desc,\"Transaction ID\")]/*[2])[1]")));
			tp.action();
		}
		
		@Test(priority=4, groups= {"distributor","F1","F2"})
		public void approve() {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Retailer Name\"]")));
			tp.approve();
		}
		
		@Test(priority=4,enabled=false, groups= {"distributor","F1","F2"})
		public void reject() {
			tp.reject();			
		}
		
		@Test(priority=4,enabled=false, groups= {"distributor","F1","F2"})
		public void cancle() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Cancel']")));
		tp.TXN_cancel();			
		}
							
		@Test(priority=4,groups = { "retailer"})
		public void Retailer_Name() throws InterruptedException, IOException {	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, 'Retailer Name')]")));
		tp.Retailer_Name().click();
		Thread.sleep(2000);
	    tp.clickFirstOptionInDropdown(0);
		tp.OK();
		}

		@Test(priority=5,groups = { "retailer"})
		public void Distributor_Name() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(tp.Distributor_Name()));
		tp.Distributor_Name().click();
		Thread.sleep(2000);
		tp.clickFirstOptionInDropdown(0);
		tp.OK();
		}
		
		
		@Test(priority=6,groups = { "retailer"})
		public void Invoice_Date() throws InterruptedException {				
		tp.Invoice_Date();
		Thread.sleep(2000);
		}
		
		@Test(priority=7,groups = { "retailer"})
		public void Invoice_DateEdite() throws InterruptedException {
		tp.Invoice_DateEdite();
		tp.Invoice_DatePass("08/17/2023");		
		tp.OK();
		Thread.sleep(2000);
		}
		
		@Test(priority=8,groups = { "retailer"})
		public void Invoice_Number() throws InterruptedException {
		tp.Invoice_Number("1232");
		Thread.sleep(2000);
		driver.hideKeyboard();
		}
				
		@Test(priority=9,groups = { "retailer"})
		public void tapOnScreen() throws InterruptedException {
		tp.tapOnScreen(driver,219,2166);
		Thread.sleep(2000);
		tp.Choose_Image();
		Thread.sleep(3000);
		}
		
		@Test(priority=10,groups = { "retailer"})
		public void Image() throws InterruptedException {
		tp.Image();
		Thread.sleep(4000);
		}
		
		@Test(priority=11,groups = { "retailer"})
		public void Pre_GST_invoice_amount() {
			AndroidActions ac = new AndroidActions(driver);
			ac.scrollToDown(5);
			tp.Pre_GST_invoice_amount("4000");
			driver.hideKeyboard();
		}
		
		@Test(priority=12,groups = { "retailer"})
		public void submit() {
		tp.submit();
		}
		
		@Test(priority=13,groups = { "retailer","distributor","F1","F2"})
		public void Back() {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@content-desc,\"Search\")]")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@content-desc,\"Transaction ID\")][1]")));
			tp.Back().click();
		}
		
		@Test(priority=14,groups = { "retailer","distributor","F1","F2"})
		public void side_menu() {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView)[2]")));
			tp.side_menu();
		}
		
		@Test(priority=15,groups = { "retailer","distributor","F1","F2"})
		public void Logout() {
			tp.Logout(); 
		}				
	}


