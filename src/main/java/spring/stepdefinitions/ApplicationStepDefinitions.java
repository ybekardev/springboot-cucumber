package spring.stepdefinitions;

import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

@Slf4j
public class ApplicationStepDefinitions {

    @When("User logs on the {string} page with {string} and {string}")
    public void user_logs_on_the_page_with_and(String string, String string2, String string3) {
        log.info("Logging...");
        int a = 5;
        Assert.assertTrue(a==5);
        Assert.assertTrue(a==2);

    }

}
