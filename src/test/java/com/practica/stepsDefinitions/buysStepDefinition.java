package com.practica.stepsDefinitions;

import com.practica.clothes.Buy;
import com.practica.clothes.Form;
import com.practica.navigate.Navigate;
import groovy.time.BaseDuration;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;


public class buysStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingresar a la pagina principal")
    public void homeCart(String actor) {
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        theActorCalled(actor).attemptsTo(Navigate.OpenHomePage());
    }

    @And("ingresar clothes {string} , {string} en donde selecciono dos productos")
    public void ingresarClothes(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        theActorInTheSpotlight().attemptsTo(
                Form.login(username, password)
        );
        withCurrentActor(
                Form.continueLogin(),
                Form.product1(),
                Form.product2()
        );

    }
    @When("visualizo el carrito de compra y doy click en checkout")
    public void visualizarCarrito(){
        withCurrentActor(
                Form.carrito(),
                Form.checkout()
        );
    }

    @When("completo el formulario de compra {string},{string},{string} hago click en continuar para continuar la compra")
    public void ingresarDatosFormulario(String name, String lastname, String code) {
        // Write code here that turns the phrase above into concrete actions
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        theActorInTheSpotlight().attemptsTo(
                Form.formbuy(name,lastname,code),
                Form.buttonContinue()
        );
    }

    @Then("hago click en finalizar compra y valido el mensaje {string}")
    public void finalizarCompra(String expectedMessage) {
        Target validarMensaje = Target.the("Mensaje de confirmación")
                .located(By.xpath("//*[@id='checkout_complete_container']/h2"));

        theActorInTheSpotlight().attemptsTo(
                Form.buttonFinish(),
                WaitUntil.the(validarMensaje, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(validarMensaje).text().contains(expectedMessage)
        );
    }

}
