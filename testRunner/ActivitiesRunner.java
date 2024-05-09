package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\SBhavana\\IdeaProjects\\hiSelenium\\src\\test\\java\\features",
        glue = {"stepDefinitions"},
        tags = "@TestActivity1"
)

public class ActivitiesRunner {
    //empty
}