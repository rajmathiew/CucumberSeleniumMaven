package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "src/test/java/stepDefinition"},
        plugin = {"pretty", "html:target/cucumber","json:cucumber.json"}
)
public class TestRunner {
}
