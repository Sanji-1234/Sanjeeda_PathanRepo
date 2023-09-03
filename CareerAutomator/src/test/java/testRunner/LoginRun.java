package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "features/Login.feature",
	    glue = "stepDefinition",
	    dryRun = true,
	    monochrome = true,
	    plugin = {"pretty"}
	)
public class LoginRun extends AbstractTestNGCucumberTests {

}
