package Android;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidActions {
	
	public AndroidDriver driver;
	public int Screenheight;
	int screenwidth;
	
	
	public AndroidActions(AndroidDriver driver) {
		this.driver= driver;
		Dimension ds = driver.manage().window().getSize();
		Screenheight=ds.getHeight();
		screenwidth=ds.getWidth();
	}

	public void longpress(AndroidDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String elementId = ((RemoteWebElement) ele).getId();
		js.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", elementId, "duration", 2000));
	
 }
	
	public void scrollAndClick(String text) { 
     driver.findElement(AppiumBy.androidUIAutomator(
             "new UiScrollable(new UiSelector().scrollable(true)."+"instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\"))")).click();
 }

		
	public void tapOnScreen( AndroidDriver driver, int x, int y) {
		TouchAction ta = new TouchAction(driver);
		ta.tap(PointOption.point(x, y)).perform();		
	}
	
	 public void scrollToDown(float TouchPoint ) {
	        int startX = screenwidth / 2;
	        float startY = Screenheight /TouchPoint; // Starting point
	        int endY = Screenheight / 6;       // Ending point
	       // String initialPageSource = driver.getPageSource();
//	        while (true) {
	            new TouchAction(driver)
	                    .press(PointOption.point(startX, (int) startY))
	                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	                    .moveTo(PointOption.point(startX, endY))
	                    .release()
	                    .perform();
	            // Optionally, you can introduce a delay to avoid fast continuous scrolling
	            try {
	                Thread.sleep(1000); // Adjust the delay time as needed
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
//	            String newPageSource = driver.getPageSource();
//	            if (newPageSource.equals(initialPageSource)) {
//	                // Content hasn't changed, indicating end of scrolling
//	                break;
//	            }
//	            initialPageSource = newPageSource;
	        }
	   
				public void ScrollToUp(float TouchPoint ) {
					 int startX = screenwidth / 2;
				        float startY = Screenheight /TouchPoint; // Starting point
				        int endY = Screenheight / 6;       // Ending point
				        
				        new TouchAction(driver)
	                    .press(PointOption.point( (int) startY, endY))
	                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	                    .moveTo(PointOption.point(  startX,endY))
	                    .release()
	                    .perform();				    
				}
				
 public void scrollToText(String text) { 
	  driver.findElement(AppiumBy.androidUIAutomator(
	  "new UiScrollable(new UiSelector().scrollable(true)."+"instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\"))"));
	      }
 
 public String getScreenShotPath(String testCaseName, AppiumDriver driver) throws IOException {
	 
	File source = driver.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"//reports"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;

}
         }
