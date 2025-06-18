package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.questions.TheResponse;
import org.example.tasks.CreateAUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CreateUserStepDefinitions {

    @When("the actor creates a user with name {string} and job {string}")
    public void theActorCreatesAUserWithNameAndJob(String name, String job) {
        theActorInTheSpotlight().attemptsTo(
                CreateAUser.withNameAndJob(name,job)
        );
    }
    @Then("the response code will be {int}")
    public void theResponseCodeWillBe(Integer int1) {
        theActorInTheSpotlight().should(
                seeThat(TheResponse.code(),equalTo(201))
        );
    }
    @Then("the id of the response will not be null")
    public void theIdOfTheResponseWillNotBeNull() {
        theActorInTheSpotlight().should(
                seeThat(TheResponse.idIsNull(),is(false))
        );
    }
}
