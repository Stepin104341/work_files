package learnselenium;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 

public class popups {
     WebDriver driver;
    @Test
    public void first() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
          driver=new ChromeDriver();
            driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html"); 
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
            Thread.sleep(3000);
            driver.switchTo().alert().accept();
            Thread.sleep(3000);
            String actual = driver.findElement(By.xpath("//*[text()='You pressed OK!']")).getText();
            Assert.assertEquals(actual, "You pressed OK!");
    }
    
    @Test(dependsOnMethods="first")
    public void second() throws InterruptedException
    {

 

        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("hii");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

 

}