package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature",glue ="stepDefination",monochrome=true)

public class TestngRunner extends AbstractTestNGCucumberTests {

}
