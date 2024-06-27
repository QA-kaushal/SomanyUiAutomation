package SomanyTestClass;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Android.RedumptionFlowPage;
import Android.RetailerNominiPage;
import Android.RetailerTXNpage;
import Android.loginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	public AndroidDriver driver;
	public  WebDriverWait wait;
	public RetailerTXNpage tp; 
	public RetailerNominiPage np;
	public loginPage lp;
	RedumptionFlowPage RF;   
	public String path=".//filexcel//SomanyUserData.xlsx";
	
	@BeforeClass(alwaysRun=true)
public void start() throws MalformedURLException, InterruptedException {
		System.out.println("a");
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Android SDK built for x86");
		System.out.println("a2"); 
		
      //options.setApp("C:\\Users\\kaushal.golangade\\eclipse-workspace\\Somany\\src\\test\\java\\resource\\Somany_19.apk");		
	//options.setChromedriverExecutable("C:\\Users\\kaushal.golangade\\Desktop\\Chromedriver");
		
		System.out.println("a3");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		 Thread.sleep(2000);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			 tp = PageFactory.initElements(driver, RetailerTXNpage.class);
			np= PageFactory.initElements(driver, RetailerNominiPage.class);
			lp = PageFactory.initElements(driver, loginPage.class);
			RF=PageFactory.initElements(driver, RedumptionFlowPage.class);
			
    }
	
	@AfterClass(alwaysRun=true)
	
	 public void sendEmailWithAttachment() {
	
	 }
	} 
	
	      

	

