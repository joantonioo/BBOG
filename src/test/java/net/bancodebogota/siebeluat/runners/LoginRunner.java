package net.bancodebogota.siebeluat.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/login.feature",glue =
        "net.bancodebogota.siebeluat.stepDefinitions",snippets = CucumberOptions.SnippetType.CAMELCASE)
public class LoginRunner {
}
