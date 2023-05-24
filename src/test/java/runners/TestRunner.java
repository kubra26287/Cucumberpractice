package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-report_smoke.html", //Rapor alabilmek icin plugine ihtiyacimiz var
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" //json ve xml makinalar arasindaki iletisim icin gecerli
        },


        features = "src/test/resources/features",
        glue = "src/test/java/stepDefinitions",
        tags = "@config",
        dryRun = false
)

public class TestRunner {
}
