package pack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class task2 {
	public static void main(String[] args) { 

		 DesiredCapabilities caps = new DesiredCapabilities();

		 caps.setCapability("udid", "32003c5bca5656d5");

		 caps.setCapability("platformName", "Android");

		 caps.setCapability("platformVersion", "10");

		 caps.setCapability("app", "C:\\Users\\User\\Downloads\\Hike.apk");


		 caps.setCapability("noReset", "true");

		 

		 //Instantiate Appium Driver

		 try {

		 AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		 

		 } catch (MalformedURLException e) {

		 System.out.println(e.getMessage());

		 }

		 }

}


