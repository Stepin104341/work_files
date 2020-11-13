package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class loginEx {
	WebDriver driver;
	@Test
	
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
       
	}
	@Test(dependsOnMethods="login")
	public void form()
	
	{
		 driver.findElement(By.id("btnLogin")).click();
			String  actual= driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
			Assert.assertEquals(actual, " Invalid credentials");
		System.out.println("Clicked");
	}
	

}
