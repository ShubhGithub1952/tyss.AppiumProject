package org.TYSS.AppiumProject.Module1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.TYSS.AppiumProject.BaseClass2;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LaunchingTheNykaaNativeAppTest extends BaseClass2 {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//	driver.findElement(By.id("com.fsn.nykaa:id/tvSkipButton")).click();
		driver.findElementByXPath("//android.widget.TextView[@text='Skip for now']").click();
		driver.findElementById("com.fsn.nykaa:id/tv_search").click();
		
	}
}
