package test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class test2 
{
	static AppiumDriver<MobileElement> driver;
	@Test
	public void test2() throws InterruptedException
	{
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("udid", "32003c5bca5656d5");
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("platformVersion", "10");
		 caps.setCapability("app","C:\\Users\\User\\Downloads\\Login Registration Example_v3.0_apkpure.com.apk");
		 caps.setCapability("fullReset", "true");
		 try 
		 {
		 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		 } 
		 catch (MalformedURLException e) 
		 {
			 System.out.println(e.getMessage());
		 }
		 driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/register")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editTextUserName")).sendKeys("aditya.mallu1@gmail.com");
		 driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editTextPassword")).sendKeys("Aditya@123");
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editTextConfirmPassword")).sendKeys("Aditya@123");
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/buttonCreateAccount")).click();

}
}
