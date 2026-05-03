package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;

@CucumberOptions(features = {"src/test/resources/features"},glue = {"stepdefination"},plugin = {"pretty","html:target/HTMLReport.html"})
public class CucumberTestRunnerClass extends AbstractTestNGCucumberTests {
    //Why do i need to import AbstractTestNGCucumberTests because -->
// It bridges Cucumber + TestNG    Parallel execution
    //Cucumber = understands feature files
//            TestNG = understands test execution
//    AbstractTestNGCucumberTests = translator between them
//    It enables TestNG features
//
//    Because of this integration, you can use TestNG capabilities like:
//
//    Grouping
//    Custom listeners
//    Advanced reporting

}
