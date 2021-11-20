package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"stepDefinitions"},
    		//  plugin = {"pretty"},
    //plugin = { "html: test-reports" },
    
    		plugin = {"json:Reports/json-report.json"},
    
    tags = "@SmokeTest",
    
   monochrome=true,
   publish=true
    
    
)
public class ActivitiesRunner {
    //empty
}