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
//		System.out.println("emailstart");
//		        try {
//		            Properties properties = new Properties();
//		            properties.put("mail.smtp.host", "smtp.sendgrid.net");
//		            properties.put("mail.smtp.port", "587"); // Use port 587 for TLS
//		            properties.put("mail.smtp.auth", "true");
//		            properties.put("mail.smtp.starttls.enable", "true");
//		            properties.put("mail.debug", "true");
//
//		            Session session = Session.getInstance(properties, new Authenticator() {
//		                protected PasswordAuthentication getPasswordAuthentication() {
//		                    return new PasswordAuthentication("apikey", "9Y7936FV949ZXB87YEPVHHSC");
//		                }
//		            });
//		 
//		            MimeMessage message = new MimeMessage(session);
//		            message.setFrom(new InternetAddress("kaushalautomation1@gmail.com"));
//		            message.setRecipient(Message.RecipientType.TO, new InternetAddress("kaushal.golangade@channelplay.in"));
//		            message.setSubject("Automation Test Report");
//		 
//		            // Create a multipart message
//		            Multipart multipart = new MimeMultipart();
//		 
//		            // Text message part
//		            MimeBodyPart textBodyPart = new MimeBodyPart();
//		            textBodyPart.setText("Hi Team,\n\nAutomation flow triggered. PFA the generated test report(Prod).\n\nThanks & Regards,\nQA Engineer.");
//		            multipart.addBodyPart(textBodyPart);
//		 
//		            // Attachment part
//		            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
//		 
//		            String filePath = "C:\\Users\\kaushal.golangade\\eclipse-workspace\\Somany\\reports\\index.htm"; // Replace with the actual file path
//		 
//		            File file = new File(filePath);
//		 
//		            if (file.exists()) {
//		                FileInputStream fileInputStream = new FileInputStream(file);
//		 
//		                attachmentBodyPart.setDataHandler(new DataHandler(new ByteArrayDataSource(fileInputStream, "text/plain")));
//		                attachmentBodyPart.setFileName(file.getName());
//		                multipart.addBodyPart(attachmentBodyPart);
//		            } else {
//		                System.out.println("File not found at: " + filePath);
//		                return;
//		            }
//		 
//		            message.setContent(multipart);
//		 
//		            Transport.send(message);
//		            System.out.println("Email sent successfully.");
//		        } catch (Exception e) {
//		            e.printStackTrace();
//		        }
//		        System.out.println("emailend");
		    }
//	

	} 
	
	      

	

