package spring.stepdefinitions;

import cucumber.api.java.en.Given;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApplicationStepDefinitions {

    @Given("User logs on the {string} page with {string} and {string}")
    public void user_logs_on_the_page_with_and(String string, String string2, String string3) {
        log.info("Logging...");
    }

}
