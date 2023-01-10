package org.TYSS.AppiumProject.Module1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.TYSS.AppiumProject.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumModuleTest1 extends BaseClass {
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= capabilities();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
	}
}
