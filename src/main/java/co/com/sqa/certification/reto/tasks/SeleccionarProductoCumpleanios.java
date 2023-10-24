package co.com.sqa.certification.reto.tasks;

import co.com.sqa.certification.reto.userInterface.CategoriaCumpleanios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProductoCumpleanios implements Task {
    private CategoriaCumpleanios categoriaCumpleanios;
    public static SeleccionarProductoCumpleanios seleccionarProducto()
    {
        return Tasks.instrumented(SeleccionarProductoCumpleanios.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CategoriaCumpleanios.HYPERVINCULO_CUMPLEANIOS));
    }
}
