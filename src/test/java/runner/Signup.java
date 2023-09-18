package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report/cucumber.html",
                "json:target/cucumber-report/cucumber.json",
        },
        features = {"src/test/resources/Features/submitForm.feature"},
        glue = {"definition"}
)
public class Signup extends AbstractTestNGCucumberTests {
}
