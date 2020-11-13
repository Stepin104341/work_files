package day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo7_relatpath 
{
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	   
	        driver.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
	       
	        Thread.sleep(2000);
	       
	        driver.manage().window().maximize();
	   
	        WebElement ele = driver.findElement(By.xpath("//*[@name='range']"));
	        Actions act = new Actions(driver);
	        Thread.sleep(2000);
	        act.dragAndDropBy(ele,80,0).build().perform();
	}
	

}
