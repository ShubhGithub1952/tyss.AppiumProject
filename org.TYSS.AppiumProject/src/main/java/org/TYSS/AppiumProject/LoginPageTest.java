package org.TYSS.AppiumProject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPageTest {
	
	public LoginPageTest(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this );
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue with Google']")
	private AndroidElement googleLoginButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Skip for now']")
	private AndroidElement skipForNowButton ;
	
	public void skipLoginPage() {
		skipForNowButton.click();
	}
	
	public void loginWithGooglePage() {
		googleLoginButton.click();
	}
}
