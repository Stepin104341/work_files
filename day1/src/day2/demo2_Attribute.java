package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2_Attribute {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\99002471\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://sciex.com/support/create-account?step=2");
        driver.manage().window().maximize();
        WebElement firstname=driver.findElement(By.name("FirstName"));
        firstname.sendKeys("Aditya mallubhatla");
        Thread.sleep(3000);
        System.out.println(firstname.getAttribute("values"));
        
        WebElement lastname=driver.findElement(By.name("LastName"));
        lastname.sendKeys("Action done");
        Thread.sleep(3000);
        System.out.println(lastname.getAttribute("values"));
        firstname.clear();
        lastname.clear();
        Thread.sleep(3000);
        driver.close();
}
}