package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions (
        features = "src/test/java/features",
        glue = {"utility", "stepDefinition"},
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
)
public class testRunner {
}
