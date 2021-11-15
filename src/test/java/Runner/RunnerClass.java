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
		
		tags={"@WebCRM_PROJECT"}
		
		)


public class RunnerClass {

}
