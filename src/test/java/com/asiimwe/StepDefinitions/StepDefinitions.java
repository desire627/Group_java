package com.asiimwe.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;  // Correct import for assertions

// Import the App class if it is in a different package
import com.asiimwe.App;

public class StepDefinitions {

    private String greeting;
    private App app;

    @Given("I have a name {string}")
    public void i_have_a_name(String name) {
        app = new App();
        greeting = app.greet(name);
    }

    @When("I greet the person")
    public void i_greet_the_person() {
        // The greeting is already created in the Given step
    }

    @Then("the greeting should be {string}")
    public void the_greeting_should_be(String expectedGreeting) {
        Assertions.assertEquals(expectedGreeting, greeting);  // Correct assertion syntax
    }
}
