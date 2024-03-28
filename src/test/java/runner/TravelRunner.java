package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:examples/Activity.feature",
        glue = "example.steps",
        dryRun = false,
        plugin = "html:target/test_report/report.html"
)

public class TravelRunner{

}
