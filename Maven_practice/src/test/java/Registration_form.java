import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_form {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Aditya");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Mallubhatla");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Hyderabad");
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("aditya.mallu1@gmail.com");
        driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("85656566");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("msdd")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[8]/label")).click();
        Thread.sleep(1000);
        Select dd=new Select(driver.findElement(By.id("Skills")));
        dd.selectByVisibleText("CSS");
        Thread.sleep(1000);
        Select count=new Select(driver.findElement(By.id("countries")));
        count.selectByVisibleText("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='select2-country-results']/li[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"yearbox\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[84]]")).click();
        

	}
}
