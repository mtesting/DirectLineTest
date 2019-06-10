import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        features = "classpath:features"
        , glue = {"classpath:steps"}
        ,tags = {"@validate-vehicle"}
        , monochrome = true
        , plugin = {"pretty", "html:target/reports", "json:target/reports.json"}
)
public class TestRunner {
}
