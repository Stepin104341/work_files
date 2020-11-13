package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Defination
{
	@Given("^I launch chrome browser$")
	public void i_launch_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I launch chrome browser");
		
	}

	@When("^I enter the url$")
	public void i_enter_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter the url");

	    }	 
	    @Then("^I should see home screen$")
	    public void i_should_see_home_screen() throws Throwable 
	    {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("I should see home screen");
	    }

	 

}

