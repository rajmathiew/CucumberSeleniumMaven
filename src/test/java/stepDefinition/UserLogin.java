package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.UserLogin.*;



public class UserLogin{
    @Given("Valid username and password")
    public void valid_username_and_password() throws InterruptedException {
        launchHomePage();
        //throw new io.cucumber.java.PendingException();
    }

    @When("I entered username and password on the Orange HRM login page")
    public void i_entered_username_and_password_on_the_Orange_HRM_login_page() throws InterruptedException {
        enterUsername();
        enterPassword();
        //throw new io.cucumber.java.PendingException();
    }


    @Then("I should successfully login to the OrangeHRM homepage")
    public void i_should_successfully_login_to_the_orange_hrm_homepage() throws InterruptedException {
        clickLoginButton();
        assertPageTitle();
        //throw new io.cucumber.java.PendingException();
    }


}