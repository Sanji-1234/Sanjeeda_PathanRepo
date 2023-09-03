package testRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "features/assignment2.feature",
	    glue = "stepDefinition",
	    dryRun = true,
	    monochrome = true,
	    plugin = {"pretty"}
	)
public class Assignment2Runner {

}
