package TestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/feature",
        glue= {"StepDefinations"},
        plugin = { "html:target/Report-html"},
        monochrome = true)

public class testRunner 
{
        	

}
