package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo8_mozilla 
{
	public static void main(String args[]) throws Exception
	{
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://emicalculator.net/loan-calculator/#");
	}
}
