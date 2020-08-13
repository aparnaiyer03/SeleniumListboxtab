package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="../Ohio/feature/list.feature",glue= {"stepDefinitions"})
public class runner {

}
