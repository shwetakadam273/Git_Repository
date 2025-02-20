package Mobiletesting;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class GoogleMapTesting {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		c.setCapability("platformName", Platform.ANDROID);
		//c.setBrowserName("chrome");
		c.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		//c.setCapability("app" , "C:\\Users\\CB\\Downloads\\Med Helper Pill Reminder_v2.8.6_apkpure.com.apk");
		c.setCapability("appPackage", "com.earthflare.android.medhelper.lite");
		c.setCapability("appActivity", "com.earthflare.android.medhelper.act2.Dashboard");
		
AndroidDriver<AndroidElement> driver =new AndroidDriver<AndroidElement>(new URL ("http://0.0.0.0:4723/wd/hub"), c);

driver.findElementByXPath("//andriod.widget.Button[text()='SKIP']").click();

AndroidElement vital = driver.findElementByAndroidUIAutomator("UiSelector().text(\"Vital\")");

driver.pressKeyCode(AndroidKeyCode.HOME);
TouchAction a = new TouchAction(driver);
Dimension d =driver.manage().window().getSize();
System.out.println(d);
a.press(d.width/2,d.height/2);
Thread.sleep(500);
a.moveTo(d.width/2,d.height/2);
Thread.sleep(500);
a.release().perform();

	}

}
