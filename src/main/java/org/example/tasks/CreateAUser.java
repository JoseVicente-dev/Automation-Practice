package org.example.tasks;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.mapper.ObjectMapperType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.example.models.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.utils.Dictionary.CREATE_USER_RESOURCE;
import static org.example.utils.JsonFormatter.formatObjectToJson;

public class CreateAUser implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateAUser.class);

    private final Request request = new Request();

    public CreateAUser(String name, String job)  {
        this.request.setName(name);
        this.request.setJob(job);
        LOGGER.info("Body request sent {}",formatObjectToJson(request));
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
