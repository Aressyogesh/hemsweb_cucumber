package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="./Features",
		plugin= {"pretty"},
		glue={"stepDefinitions","hooks"},
		tags= "@Smoke",
		dryRun=false, 
		monochrome=true,
		stepNotifications=true
		) 
public class serenityrunner {

}
