package Maven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false, monochrome=true,features= {"Features/login.feature"}, glue="steps", format= {"pretty"})
public class runner {

}
