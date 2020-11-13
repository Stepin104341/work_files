

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo6_relatpath {
	@Test (description="FirstMethod")
	public void login() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sciex.com/support/create-account?step=2");
        driver.findElement(By.xpath("//*[@name='FirstName']")).sendKeys("Aditya");
        driver.findElement(By.xpath("//*[@name='LastName']")).sendKeys("Mallubhatla");
        driver.findElement(By.name("EmailAddress")).sendKeys("abc.kh@xyz.com");
        driver.findElement(By.name("Company")).sendKeys("LTTS");
        driver.findElement(By.name("MarketSegment")).sendKeys("Clinical");
        driver.findElement(By.id("password_create")).sendKeys("crazy12344");
        driver.findElement(By.name("confirmpassword")).sendKeys("crazy12344");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Accept Cookies']")).click();
        Thread.sleep(3000);
        //driver.close();
       }
}
