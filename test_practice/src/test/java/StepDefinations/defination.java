package StepDefinations;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class defination 
{
	static AppiumDriver<MobileElement> driver;
	 int scrollStart, scrollEnd;
	@Given("^I want to launch scroll bar$")
	public void i_want_to_launch_scroll_bar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 DesiredCapabilities caps = new DesiredCapabilities();
//         caps.setCapability("deviceName", "My Phone");
         caps.setCapability("udid", "32003c5bca5656d5"); //Give Device ID of your mobile phone
         caps.setCapability("platformName", "Android");
         caps.setCapability("platformVersion", "10");
         //caps.setCapability("app","C:\\Users\\Mahavir\\Downloads\\com.afwsamples.testdpc_7.0.2-7002_minAPI21(nodpi)_apkmirror.com.apk");
         caps.setCapability("app", System.getProperty("user.dir") + "/framework/com.afwsamples.testdpc_7.0.2-7002_minAPI21(nodpi)_apkmirror.com.apk");
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

	@When("^scroll down$")
	public void scroll_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  Dimension dimensions = driver.manage().window().getSize();
	         Double screenHeightStart = dimensions.getHeight() * 0.9;
	         scrollStart = screenHeightStart.intValue();
	         Double screenHeightEnd = dimensions.getHeight() * 0.2;
	         scrollEnd = screenHeightEnd.intValue();
		

	    }	 
	    @Then("^it should scroll down$")
	    public void it_should_scroll_down() throws Throwable 
	    {
	        // Write code here that turns the phrase above into concrete actions
	    	new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))
	         .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd)); 
	        
	    }	
	

}
