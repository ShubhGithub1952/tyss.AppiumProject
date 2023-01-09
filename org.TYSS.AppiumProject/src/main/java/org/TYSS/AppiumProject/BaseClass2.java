package org.TYSS.AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass2 {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.fsn.nykaa");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.fsn.nykaa.SplashScreenActivity");
		driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
}
