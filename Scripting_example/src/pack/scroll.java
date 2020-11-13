package pack;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class scroll {
	    static AppiumDriver<MobileElement> driver;
	    @Test
	    public void Initialization() throws InterruptedException
	    {
	         //Set the Desired Capabilities
	         DesiredCapabilities caps = new DesiredCapabilities();
	         caps.setCapability("deviceName", "My Phone");
	         caps.setCapability("udid", "33009551add3b29b"); //Give Device ID of your mobile phone
	         caps.setCapability("platformName", "Android");
	         caps.setCapability("platformVersion", "10");
	         caps.setCapability("app","C:\\Users\\Mahavir\\Downloads\\com.afwsamples.testdpc_7.0.2-7002_minAPI21(nodpi)_apkmirror.com.apk");
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
	         Thread.sleep(8000);
	      //   TouchAction action = new TouchAction(driver);
	     //    action.press(PointOption.point(339, 245)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	     //    .moveTo(PointOption.point(339, 205)).release().perform();
	         Dimension dimensions = driver.manage().window().getSize();
	         Double screenHeightStart = dimensions.getHeight() * 0.9;
	         int scrollStart = screenHeightStart.intValue();
	         Double screenHeightEnd = dimensions.getHeight() * 0.2;
	         int scrollEnd = screenHeightEnd.intValue();
	         // int scrollEnd = scrollStart - 10;
	         new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))
	         .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd)); 
	    }
	}