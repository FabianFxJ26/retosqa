package co.com.sqa.certification.reto.stepdefinitions;

import co.com.sqa.certification.reto.tasks.AbrirPagina;
import co.com.sqa.certification.reto.tasks.SeleccionarProductoAmor;
import co.com.sqa.certification.reto.tasks.SeleccionarProductoCumpleanios;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
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
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductoAmor.seleccionarProductos());
    }
    @Given("select the product")
    public void selectTheProduct() {
        OnStage.theActorCalled("Fabian").wasAbleTo(AbrirPagina.abrirPagina());
    }
    @When("it add the product to the buy car")
    public void itAddTheProductToTheBuyCar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductoCumpleanios.seleccionarProducto());
    }
    @When("it is deleting to the buy car")
    public void itIsDeletingToTheBuyCar() {
    }
}
