package utilitypackage;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;

import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import io.cucumber.java.Scenario;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CucumberHooks extends EnvironmentSettings{
    Scenario scenario;
    @Before
    public void launchUrl() {
       super.browserSetup();
    }

    @After
    public void tearDown() {

    }
    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            takeScreenshot(scenario.getName());
        }
    }

    private void takeScreenshot(String scenarioName) {
        try {
            byte[] screenshot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenarioName + "_screenshot");
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
    }

}
