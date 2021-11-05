package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features/MercuryTours.feature",glue= {"StepDefinitions"},
monochrome=true)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
