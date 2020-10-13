package Prueba.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/automatizacion_utest_usuario.feature",
        glue = {"Prueba/stepdefinitions","util"},
        snippets = SnippetType.CAMELCASE
)

public class RunnerTag {
}
