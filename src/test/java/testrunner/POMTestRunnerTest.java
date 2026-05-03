package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@regression", features = {"src/test/resources/featurewithtags"},glue = {"stepdefination"},plugin = {"pretty","html:target/HTMLReport.html"})

public class POMTestRunnerTest extends AbstractTestNGCucumberTests {

}
