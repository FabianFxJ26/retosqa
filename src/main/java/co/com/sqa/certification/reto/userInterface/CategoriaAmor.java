package co.com.sqa.certification.reto.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaAmor
{
    public static final Target HYPERVINCULO_CATEGORIA_AMOR = Target.the("Hypervinculo que redirecciona"+
            "a la pagina donde se encuentran los productos categoria Amor").located(By.linkText("Amor"));
    public static final Target PRODUCTO_1 = Target.the("Seleccion del primer producto que se"+
            "aniadira al carro de compras").located(By.xpath("//a[@class='product-image image-loaded']"));
    public static final Target AGREGAR_AL_CARRITO_PRODUCTO_1 = Target.the("Agrega el producto seleccionado"+
            "al carro de compras").located(By.xpath("//*[@class='single_add_to_cart_button button alt' and @value='4100']"));
    public static final Target SEGUIR_COMPRANDO = Target.the("Seguir comprando para seleccionar"+
            "el producto 2").located(By.xpath("//*[@class='button wc-forward']"));
    public static final Target PRODUCTO_2 = Target.the("Seleccion del segundo producto que se"+
            "aniadira al carro de compras").located(By.xpath("//*[@class='image-no-effect unveil-image']"));
    public static final Target AGREGAR_AL_CARRITO_PRODUCTO_2 = Target.the("Agrega el producto seleccionado"+
            "al carro de compras").located(By.xpath("//*[@class='single_add_to_cart_button button alt']"));
}
