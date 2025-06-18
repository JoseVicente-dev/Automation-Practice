package org.example.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;

public class TheResponse {

    public static Question<Integer> code(){
        return actor -> SerenityRest.lastResponse().getStatusCode();
    }

    public static Question<Boolean> idIsNull(){
        return actor -> SerenityRest.lastResponse().jsonPath().getString("id").isEmpty();
    }
}
