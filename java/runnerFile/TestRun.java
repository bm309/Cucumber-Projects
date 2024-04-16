package runnerFile;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/FeatureFiles/login.feature"},
		dryRun = true,
		glue="stepDefinition",
		snippets = SnippetType.CAMELCASE,
		monochrome=true
		)



public class TestRun extends AbstractTestNGCucumberTests{

}
