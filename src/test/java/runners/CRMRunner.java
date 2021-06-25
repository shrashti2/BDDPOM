package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src//test//resources//features//",
		glue = {"stepdefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		)
public class CRMRunner extends AbstractTestNGCucumberTests {

}
