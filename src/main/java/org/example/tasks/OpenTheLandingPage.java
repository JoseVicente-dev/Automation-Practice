package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.example.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.example.utils.Dictionary.ACTOR_NAME;

public class OpenTheLandingPage implements Task {

    private LoginPage loginPage;

    @Override
    public <T extends Actor> void performAs(T t) {
        theActorCalled(ACTOR_NAME).wasAbleTo(Open.browserOn(loginPage));
    }

    public static OpenTheLandingPage openTheLandingPage(){
        return instrumented(OpenTheLandingPage.class);
    }
}
