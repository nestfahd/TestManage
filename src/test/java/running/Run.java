package running;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/TES-1,TES-2,TES-3.feature"},
glue = {"steppp"},dryRun = false,
plugin = { "html:Reports/HtmlReports.html",	"json:Reports/JsonReports.json"},
monochrome = true,
publish = true)

public class Run {

}
