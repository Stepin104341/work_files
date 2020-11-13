package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo3_select_tag {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        driver.manage().window().maximize();
        WebElement dropdown=driver.findElement(By.id("select-demo"));
        Thread.sleep(1000);
       
        Select dd=new Select(dropdown);
        dd.selectByVisibleText("Monday");
        Thread.sleep(1000);
        dd.selectByIndex(6);
        Thread.sleep(2000);
        driver.close();
}
}
