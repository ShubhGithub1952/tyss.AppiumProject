package org.TYSS.AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		//File app = new File("E:\\ADB\\ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9");
		//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
		driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
}
