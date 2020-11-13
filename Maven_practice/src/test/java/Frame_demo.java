import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_demo 
{
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Frames.html");
        //driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Aditya");
        int size=driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        Thread.sleep(2000);
        driver.switchTo().frame("SingleFrame");
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Aditya");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
        /*driver.switchTo().frame("MultipleFrames");
        driver.switchTo().frame("SingleFrame");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Aditya");
        */
        int s=driver.findElements(By.tagName("iframe")).size();
        System.out.println(s);
        driver.switchTo().frame(1);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Aditya");
        
	}
	

}
