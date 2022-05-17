package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features",
		plugin= {"pretty", "html:target/cucumber-report/cucumber.html",
						   "json:target/cucumber-report/cucumber.json",
						   "junit:target/cucumber-report/cucumber.xml",
						   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						   "rerun:rerun/failed_scenarios.txt"},
		glue={"stepDefinitions","hooks"},
		tags= "@Smoke",
		dryRun=false, 
		monochrome=true,
		stepNotifications=true
		) 
public class runner {

}
