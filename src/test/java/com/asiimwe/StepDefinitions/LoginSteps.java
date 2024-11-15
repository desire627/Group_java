package com.asiimwe.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        // Code to navigate to login page
    }

    @When("the user enters valid credentials")
    public void userEntersValidCredentials() {
        // Code to enter valid credentials
    }

    @Then("the user should be redirected to the dashboard")
    public void userRedirectedToDashboard() {
        // Code to verify redirection to dashboard
    }

    @When("the user enters invalid credentials")
    public void userEntersInvalidCredentials() {
        // Code to enter invalid credentials
    }

    @Then("an error message should be displayed")
    public void errorMessageDisplayed() {
        // Code to check for error message
    }
}
