package co.com.sqa.certification.reto.tasks;

import co.com.sqa.certification.reto.userInterface.CategoriaAmor;
import co.com.sqa.certification.reto.userInterface.PaginaParaAbrir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProductoAmor implements Task {
    private CategoriaAmor categoriaAmor;
    private PaginaParaAbrir paginaParaAbrir;
    public static SeleccionarProductoAmor seleccionarProductos()
    {
        return Tasks.instrumented(SeleccionarProductoAmor.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CategoriaAmor.HYPERVINCULO_CATEGORIA_AMOR),Click.on(CategoriaAmor.PRODUCTO_1),Click.on(CategoriaAmor.AGREGAR_AL_CARRITO_PRODUCTO_1),
                Click.on(CategoriaAmor.SEGUIR_COMPRANDO),Click.on(CategoriaAmor.PRODUCTO_2),
                Click.on(CategoriaAmor.AGREGAR_AL_CARRITO_PRODUCTO_2));
    }
}
