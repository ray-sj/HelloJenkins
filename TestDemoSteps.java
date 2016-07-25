package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestDemoSteps {

	@Given("^the user is on the login page and entered valid credentials$")
	public void the_user_is_on_the_login_page_and_entered_valid_credentials() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("Given step");
	}

	@When("^they click on the Login button$")
	public void they_click_on_the_Login_button() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("When step");
	}

	@Then("^the Landing page is displayed$")
	public void the_Landing_page_is_displayed() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("Then step");
	}

}
