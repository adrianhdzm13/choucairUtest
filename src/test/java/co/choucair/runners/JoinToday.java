package co.choucair.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/joinToday",
        glue = {"co.choucair.stepsDefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@JOIN",
        dryRun = false,
        monochrome = true
)
public class JoinToday {
}