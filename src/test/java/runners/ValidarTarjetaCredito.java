package runners;

import cucumber.api.CucumberOptions;
        import cucumber.api.SnippetType;
        import net.serenitybdd.cucumber.CucumberWithSerenity;
        import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/validar_tarjeta_credito.feature",//mapea la histori
        glue = "stepdefinitions", //mapea los steps
        snippets = SnippetType.CAMELCASE) //estandar de java

public class ValidarTarjetaCredito {

}
