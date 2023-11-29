package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/Features",
        glue = {"StepDefination"}
)
public class RunCucumberTests extends AbstractTestNGCucumberTests {
    // This class doesn't need any code because it's used for TestNG-Cucumber integration
}
