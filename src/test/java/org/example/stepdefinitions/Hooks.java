package org.example.stepdefinitions;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.tasks.OpenTheLandingPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.example.utils.Dictionary.ACTOR_NAME;


public class Hooks {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME);
    }
}
