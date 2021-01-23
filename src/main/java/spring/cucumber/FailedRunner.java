package spring.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"src/main/java/spring/stepdefinitions"},
        tags = {"@test"},
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/cucumber-report",
                "json:target/cucumber-report/cucumber.json",
                "junit:target/cucumber-report/cucumber-results.xml",
                "rerun:target/rerun.txt"
        }
)

public class FailedRunner {
}
