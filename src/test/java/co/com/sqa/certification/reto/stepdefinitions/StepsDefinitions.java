package co.com.sqa.certification.reto.stepdefinitions;

import co.com.sqa.certification.reto.tasks.AbrirPagina;
import co.com.sqa.certification.reto.tasks.SeleccionarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepsDefinitions
{
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Open page")
    public void openPage() {
        OnStage.theActorCalled("Fabian").wasAbleTo(AbrirPagina.abrirPagina());
    }
    @When("the customer selects amor category and add two products")
    public void theCustomerSelectsAmorCategoryAndAddTwoProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProducto.seleccionarProductos());
    }

    @Then("those products are adding to the buycar")
    public void thoseProductsAreAddingToTheBuycar() {
        // Write code here that turns the phrase above into concrete actions
    }
}
