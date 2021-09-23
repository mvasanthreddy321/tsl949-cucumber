package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/FrontAcc.feature",glue="stepDefination",
                monochrome=false,plugin= {"pretty","html:target/tsl949.html","json:target/jsonReport/report.json"})
                                                             
public class FrontRunner {

}
