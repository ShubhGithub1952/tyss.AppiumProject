package org.TYSS.AppiumProject.Module1;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.TYSS.AppiumProject.BaseClass3;
import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class OrientationTestOnNativeAppTest extends BaseClass3 {

	public static void swipingAction(AndroidDriver driver, int pointX, int pointY, int xOffset, int yOffset ) {
		TouchAction action= new TouchAction(driver);
		action.press(PointOption.point(pointX, pointY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(PointOption.point(xOffset, yOffset)).release().perform();
	}

	public static void main(String[] args) throws MalformedURLException, Throwable {	
		AndroidDriver<AndroidElement> driver= capabilities();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue with Google']")).click();
		driver.findElementByXPath("//android.widget.TextView[@text='Pitale Shubham']").click();
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.fsn.nykaa:id/tapToPlay']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Start Shopping']")).click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@resource-id='com.fsn.nykaa:id/notification']").click();
		driver.findElementByXPath("//android.widget.TextView[@resource-id='com.fsn.nykaa:id/wishlist']").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@resource-id='com.fsn.nykaa:id/action_shopping_cart']").click();
		driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.fsn.nykaa:id/toolbar_logo']").click();
		//driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.fsn.nykaa:id/iv_prive_user_logo']").click();
		String checkApplication = driver.getContext();
		System.out.println(checkApplication);
		//action.press(PointOption.point(0, 0)).moveTo(PointOption.point(0, 0)).release().perform();
		OrientationTestOnNativeAppTest.swipingAction(driver, 987, 483, 110, 483);
		OrientationTestOnNativeAppTest.swipingAction(driver, 987, 483, 110, 483);
		OrientationTestOnNativeAppTest.swipingAction(driver, 987, 483, 110, 483);
		TouchAction act= new TouchAction(driver);
		act.tap(PointOption.point(939, 490)).perform();
		//driver.quit();
	}
}
