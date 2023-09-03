package testRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "features/Home.feature",
	    glue = "stepDefinition",
	    dryRun = true,
	    monochrome = true,
	    plugin = {"pretty"}
	)
public class HomeRunner {
	
}
