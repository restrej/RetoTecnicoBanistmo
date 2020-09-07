package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.AbrirElBrowser;
import userinterface.InicioPage;

public class ValidarTarjetaCreditoStepDefinition {

    @Managed(driver="chrome")//Definir el drive para la prueba
    private WebDriver browser;

    private Actor juan=Actor.named("Juan");

    @Page
    private InicioPage inicioPage;


    @Before //Lo que ejecuta antes de la prueba
    public void setUP(){
        juan.can(BrowseTheWeb.with(browser));
    }

    @Given("^que Juan quiere ingresar a productos y servicios de personas banistmo$")
    public void queJuanQuiereIngresarAProductosYServiciosDePersonasBanistmo() {
            juan.wasAbleTo(AbrirElBrowser.on(inicioPage));
        }

    @When("^busca el producto tarjetas de credito$")
    public void buscaElProductoTarjetasDeCredito() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validar que al descargar el pdf del contrato fue generado exitosamente$")
    public void validarQueAlDescargarElPdfDelContratoFueGeneradoExitosamente() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
