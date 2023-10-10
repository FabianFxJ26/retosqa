package co.com.sqa.certification.reto.stepdefinitions;

import co.com.sqa.certification.reto.tasks.AbrirPagina;
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
    @Given("than Fabian went learn")
    public void thanFabianWentLearn() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Fabian").wasAbleTo(AbrirPagina.abrirPagina());
    }

    @When("he searchs a internet page")
    public void heSearchsAInternetPage() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("he inserts the url")
    public void heInsertsTheUrl() {
        // Write code here that turns the phrase above into concrete actions

    }
}
