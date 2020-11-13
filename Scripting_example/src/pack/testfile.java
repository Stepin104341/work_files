package pack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class testfile 
{
	static AppiumDriver<MobileElement> driver;
	@Test
	public void initialization()
	{
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("udid", "32003c5bca5656d5");
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("platformVersion", "10");
		 caps.setCapability("appPackage", "com.google.android.calculator");
		 caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		 caps.setCapability("noReset", "true");
		 try 
		 {
		 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		 } 
		 catch (MalformedURLException e) 
		 {
			 System.out.println(e.getMessage());
		 }
	}
@Test(dependsOnMethods="initialization",priority=1)
	
	public void add() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		//driver.findElementByAccessibilityId("plus").click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		Assert.assertEquals(actual,"15");
		driver.findElement(By.id("com.google.android.calculator:id/clr")).click();	
		Thread.sleep(1000);
	}
	
@Test(dependsOnMethods="initialization",priority=0)
	
	public void minus() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
		//driver.findElementByAccessibilityId("plus").click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		Assert.assertEquals(actual,"0");
		driver.findElement(By.id("com.google.android.calculator:id/clr")).click();	
		Thread.sleep(1000);
	}
@Test(dependsOnMethods="initialization",priority=2)

public void multiplication() throws InterruptedException
{
	Thread.sleep(1000);
	driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
	//driver.findElementByAccessibilityId("plus").click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	Thread.sleep(1000);
	String actual=driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
	Assert.assertEquals(actual,"81");
	driver.findElement(By.id("com.google.android.calculator:id/clr")).click();	
	Thread.sleep(1000);
}
	
	

}
