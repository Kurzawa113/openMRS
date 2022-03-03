package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


	@CucumberOptions(
			
			features="/Users/admin/eclipse-workspace/openMRS/src/main/resources/Features/login.feature",
			glue="StepDefinitions",
			monochrome=true,
			plugin= {
					"pretty",
					"html:test-out/cucumber-report.html",
					"junit:junit-xml/cucumber.xml"
			},
			dryRun=false
			
			
			)
	
	
	


public class TestRunner {

	
	

}
