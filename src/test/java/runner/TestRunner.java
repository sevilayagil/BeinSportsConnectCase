package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
      "pretty",
      "html:target/cucumber-html-report",
      "json:target/cucumber-json-report/cucumber-json.json"
    },
    features = {"src/test/resources/Subscribe.feature"},
    glue = "scenarios/testcases",
    tags = {"@subs"})
public class TestRunner {}
