package pack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class dragdroptest 
{
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws InterruptedException 
	{
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("udid", "32003c5bca5656d5");
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("platformVersion", "10");
		 caps.setCapability("app", "C:\\Users\\User\\Downloads\\Dragdrop.apk");
		 caps.setCapability("noReset", "true");
		 try 
		 {
		 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		 } 
		 catch (MalformedURLException e) 
		 {
			 System.out.println(e.getMessage());
		 }
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/btn_football")).click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement source =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/chooseB"));
		 WebElement target =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/answer"));
		 TouchAction action=new TouchAction((MobileDriver)driver);
		 action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement sourc =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/chooseB"));
		 WebElement targe =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/answer"));
		 TouchAction actio=new TouchAction((MobileDriver)driver);
		 action.longPress(ElementOption.element(sourc)).moveTo(ElementOption.element(targe)).release().perform();
		 
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement sour =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/chooseA"));
		 WebElement targ =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/answer"));
		 TouchAction acti=new TouchAction((MobileDriver)driver);
		 action.longPress(ElementOption.element(sour)).moveTo(ElementOption.element(targ)).release().perform();
		 
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement sou =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/chooseC"));
		 WebElement tar =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/answer"));
		 TouchAction act=new TouchAction((MobileDriver)driver);
		 action.longPress(ElementOption.element(sou)).moveTo(ElementOption.element(tar)).release().perform(); 
		 
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement so =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/chooseA"));
		 WebElement ta =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/answer"));
		 TouchAction ac=new TouchAction((MobileDriver)driver);
		 action.longPress(ElementOption.element(so)).moveTo(ElementOption.element(ta)).release().perform(); 
		 
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement so1 =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/chooseC"));
		 WebElement ta1 =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/answer"));
		 TouchAction ac1=new TouchAction((MobileDriver)driver);
		 action.longPress(ElementOption.element(so1)).moveTo(ElementOption.element(ta1)).release().perform(); 
		 
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement sourc1 =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/chooseB"));
		 WebElement targe1 =driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/answer"));
		 TouchAction actio1=new TouchAction((MobileDriver)driver);
		 action.longPress(ElementOption.element(sourc1)).moveTo(ElementOption.element(targe1)).release().perform();
		 	 
		
	}
	

}
