package co.com.sqa.certification.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/retosqa.feature",
        tags = "@stories",
        glue = "co.com.sqa.certification.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
