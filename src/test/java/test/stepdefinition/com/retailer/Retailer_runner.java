package test.stepdefinition.com.retailer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Retailer.feature",glue = "com.retailer", publish = true, dryRun = true, plugin = {"pretty","html:target/Htmlreport","junit:Reports\\junitreport.xml","json:Reports\\jsonreport.json"}, monochrome = true)
public class Retailer_runner {

}
