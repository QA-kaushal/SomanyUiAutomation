package SomanyTestClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {
	AndroidDriver driver;
	public AndroidActions (AndroidDriver driver) {
		this.driver = driver;
	}
	
	public void LongPresaction(WebElement ele) {
		((JavascriptExecutor )driver).executeScript("mobile:scrollGesture",ImmutableMap.of
				("elementId", ((RemoteWebElement)ele).getId(),
				"Duration",2000));				
	}	
	public void ScrollToEndAction() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boolean canscrollMore;
		do {
			canscrollMore = (boolean) js.executeAsyncScript("mobile: scrollGesture", ImmutableMap.of(
					"left", 100, "top", 100, "width", 200,
					"percent", 3.0));
		
	}while (canscrollMore);
	
	}	
	public void ScrollToText(String text) {
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+text+"\"))"));

		
	}
}
