package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"Login"},glue= {"StepDefinition"},tags="", monochrome=true,
dryRun=false,strict=true,
plugin= {"html:testoutput/report.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"})
public class testrunner {

}
