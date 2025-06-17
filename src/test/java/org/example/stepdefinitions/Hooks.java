package org.example.stepdefinitions;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.utils.Dictionary.ACTOR_NAME;
import static org.example.utils.Dictionary.BASE_URL;


public class Hooks {

    private EnvironmentVariables environmentVariables;

    @Before(order=1)
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME);
    }

    /**
     * Method to configure the base url
     */
    @Before(order=2)
    public void configureBaseUrl(){
        String baseApiUrl=environmentVariables.optionalProperty("restapi.baseurl").orElse(BASE_URL);
        theActorInTheSpotlight().whoCan(CallAnApi.at(baseApiUrl));
    }

}
