package testStepDefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.DriverInitialization;


public class test1 extends DriverInitialization {
	

	@When("^I print \"([^\"]*)\"$")
	public void i_Print_Element(String text) throws Throwable {
		System.out.println("I Print "+text);
		driver.get("https://blog.cloudrail.com/");
	}
	
	
	@Then("^I print \"([^\"]*)\" on second test scenario$")
	public void i_Print_Element_on_second_test_scenario(String text) throws Throwable {
		System.out.println(driver);
		driver.get("http://www.restapitutorial.com/");
	}
}
