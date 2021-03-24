package spring.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.config.SpringConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"spring.stepdefinitions"},
        tags = {"@tst"},
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/cucumber-report",
                "json:target/cucumber-report/cucumber.json",
                "junit:target/cucumber-report/cucumber-results.xml",
        }
)
@SpringBootApplication
public class ApplicationRunner {} /*implements CommandLineRunner {
	 public static void main(String[] args) { SpringApplication.run(ApplicationRunner.class, args); }

	 @Autowired
     SpringConfig springConfig;

        @Override
        public void run(String... args) throws Exception {
                String test = springConfig.step();
                System.out.println(test);
        }
}*/
