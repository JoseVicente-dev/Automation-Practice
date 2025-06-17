package org.example.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/login.feature"},
        glue ={"org.example.stepdefinitions"},
        tags = "",
        plugin = {"pretty"}
)
public class TestRunnerAutomationPractice {
}
