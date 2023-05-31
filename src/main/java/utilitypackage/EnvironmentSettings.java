package utilitypackage;


import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvironmentSettings {

    private static final String PROPERTY_FILE = "config.properties";
    private Properties properties;

    public EnvironmentSettings() {
        properties = new Properties();
        try (InputStream inputStream = new FileInputStream(PROPERTY_FILE)) {
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                System.out.println("Unable to find the property file: " + PROPERTY_FILE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public  void browserSetup(){
        if (getProperty("browser").equalsIgnoreCase("chrome")){
            Configuration.browser = "chrome";
        }
        else if (getProperty("browser").equalsIgnoreCase("firefox")){
            Configuration.browser = "chrome";
        }
        else Configuration.browser = "chrome";
    }
}



