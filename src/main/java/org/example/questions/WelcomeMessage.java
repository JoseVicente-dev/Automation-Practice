package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.example.ui.LoginPage;

public class WelcomeMessage {

    public static Question<String> displayed(){
        return Text.of(LoginPage.ALERT_FLASH_MESSAGE).asString();
    }
}
