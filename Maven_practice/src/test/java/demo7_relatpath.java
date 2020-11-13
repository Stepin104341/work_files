import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class demo7_relatpath 
{	
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://emicalculator.net/loan-calculator/#");
	        Thread.sleep(2000);
	        JavascriptExecutor js=(JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");
	       
	     
	}
}
	
	
