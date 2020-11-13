package test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class test_radio {
		static AppiumDriver<MobileElement> driver;
		public static void main(String[] args) 
		{
			 DesiredCapabilities caps = new DesiredCapabilities();
			 caps.setCapability("udid", "32003c5bca5656d5");
			 caps.setCapability("platformName", "Android");
			 caps.setCapability("platformVersion", "10");
			 caps.setCapability("app","C:\\Users\\User\\Downloads\\RADIO BUTTON_v1.0_apkpure.com.apk");
			 caps.setCapability("noReset", "true");
			 try 
			 {
			 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			 } 
			 catch (MalformedURLException e) 
			 {
				 System.out.println(e.getMessage());
			 }
			 driver.findElement(By.id("com.somewow.radiobutton:id/radio_one")).click();
			 driver.findElement(By.id("com.somewow.radiobutton:id/button_apply")).click();
			 String actual =  driver.findElement(By.id("com.somewow.radiobutton:id/text_view_selected")).getText();
	         Assert.assertEquals( actual , "Your choice: 0" );
			 

	}
}
