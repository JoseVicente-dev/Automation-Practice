package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.example.utils.Dictionary.ACTOR_NAME;

public class LoginThePage implements Task {

    private String username;
    private String password;

    public LoginThePage(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        theActorCalled(ACTOR_NAME).attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(password).into(LoginPage.PASSSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)

        );

    }

    public static LoginThePage WithCredentials(String username, String password){
        return instrumented(LoginThePage.class, username,password);
    }
}
