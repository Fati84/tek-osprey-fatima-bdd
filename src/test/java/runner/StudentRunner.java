package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="classpath:examples/ClassStudents.feature ",
        glue = "example.steps",
        dryRun = false
)

public class StudentRunner {


}
