package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        String s = driver.findElement(By.id("txtUsername")).getAttribute("value");
        System.out.println(s);
        boolean b = driver.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).isDisplayed();
        System.out.println(b);
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("MP_link")).click();
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();      
	}
}
