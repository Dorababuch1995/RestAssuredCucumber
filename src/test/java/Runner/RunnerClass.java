package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"src/test/resources/Features"},
		strict =true,
		monochrome=true,
				dryRun = false,
		
		glue ={"com.Stepdefinition"},
		
		tags={"@RestAssured_API_CALLS"}
		
		)


public class RunnerClass {

}
