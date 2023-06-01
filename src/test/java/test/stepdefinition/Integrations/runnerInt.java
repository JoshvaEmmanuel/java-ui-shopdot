package test.stepdefinition.Integrations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources.resources/Integrations.feature", glue = "Integration", dryRun = false, monochrome = true)
public class runnerInt {

}
