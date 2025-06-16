package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.questions.WelcomeMessage;
import org.example.tasks.LoginThePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.tasks.OpenTheLandingPage.openTheLandingPage;
import static org.hamcrest.Matchers.containsString;

public class LoginStepDefinitions {

    @Given("that a registered user is on the login page")
    public void thatARegisteredUserIsOnTheLoginPage() {
        theActorInTheSpotlight().wasAbleTo(openTheLandingPage());
    }
    @When("he tries to login with valid credentials {string} and {string}")
    public void heTriesToLoginWithValidCredentials(String username, String password) {
        theActorInTheSpotlight().attemptsTo(
                LoginThePage.WithCredentials(username, password)
        );
    }
    @Then("should see the message {string}")
    public void shouldSeeTheMessage(String message) {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(
                seeThat(WelcomeMessage.displayed(), containsString(message))
        );
    }
}
