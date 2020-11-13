package pack;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class exec {
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) 
	{
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("udid", "32003c5bca5656d5");
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("platformVersion", "10");
		 caps.setCapability("appPackage", "dragdrop.stufflex.com.dragdro");
		 caps.setCapability("appActivity", "dragdrop.stufflex.com.dragdrop.MainActivity");
		 caps.setCapability("noReset", "true");
		 //Instantiate Appium Driver
		 try 
		 {
		 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		 } 
		 catch (MalformedURLException e) 
		 {
			 System.out.println(e.getMessage());
		 }
		 }
		 }

