package pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class test4 
{
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) 
	{
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("udid", "32003c5bca5656d5");
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("platformVersion", "10");
		 caps.setCapability("appPackage", "com.afwsamples.testdpc");
		 caps.setCapability("appActivity", "com.afwsamples.testdpc.PolicyManagementActivity");
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
		 TouchAction action=new TouchAction(driver);
		 action.press(PointOption.point(487, 2053)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
         .moveTo(PointOption.point(449, 444)).release().perform();
		
		 }		 
}
	


