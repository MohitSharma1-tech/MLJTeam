package Com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Com/Login",glue="Com.pages",tags="@test",plugin="json:target/jsonReports/testreport.json")
public class TestRunner {
          
}


