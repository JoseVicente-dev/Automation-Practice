package org.example.tasks;

import io.restassured.mapper.ObjectMapperType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.example.models.Request;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.utils.Dictionary.CREATE_USER_RESOURCE;

public class CreateAUser implements Task {


    private Request request ;

    public CreateAUser(String name, String job){
        this.request=new Request(name,job);
    }

    public static CreateAUser withNameAndJob(String name, String job){
        return instrumented(CreateAUser.class,name,job);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Post.to(CREATE_USER_RESOURCE).
                        with(requestSpecification -> requestSpecification.
                                header("Content-Type", "application/json").
                                header("x-api-key", "reqres-free-v1").
                                body(request).log().all())
        );
    }
}
