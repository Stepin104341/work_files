package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://sciex.com/support/create-account");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        WebElement ele=driver.findElement(By.xpath("//*[@id=\"nav\"]/div/ul/li[1]/a"));
        Thread.sleep(3000);
        Actions act=new Actions(driver);
        act.moveToElement(ele).build().perform();
        Thread.sleep(3000);
        driver.close();

}
}
