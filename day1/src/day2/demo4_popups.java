package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4_popups {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
        driver.switchTo().alert().sendKeys("aditya");
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

}
}
