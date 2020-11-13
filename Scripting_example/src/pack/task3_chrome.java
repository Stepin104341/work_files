package pack;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class task3_chrome {
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws InterruptedException 
	{
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("udid", "32003c5bca5656d5");
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("platformVersion", "10");
		 caps.setCapability("browserName", "chrome");
		 caps.setCapability("noReset", "true");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
		 //Instantiate Appium Driver
		 try 
		 {
		 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		 }
		 catch (MalformedURLException e) 
		 {
		 System.out.println(e.getMessage());
		 }
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	/*driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hello");
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	*/
}
}
