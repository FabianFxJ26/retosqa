package co.com.sqa.certification.reto.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaCumpleanios {
 public static final Target HYPERVINCULO_CUMPLEANIOS = Target.the("Seleccion categoria cumpleanios")
        .located(By.xpath("//*[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-2799' and @id='menu-item-2799']"));
}
