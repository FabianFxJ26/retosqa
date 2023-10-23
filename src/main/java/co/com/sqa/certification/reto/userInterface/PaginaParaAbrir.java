package co.com.sqa.certification.reto.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.floristeriamundoflor.com/")
public class PaginaParaAbrir extends PageObject {
  public static final Target HYPERVINCULO_CATEGORIA_AMOR = Target.the("Hypervinculo que redirecciona"+
          "a la pagina donde se encuentran los productos categoria Amor").located(By.linkText("Amor"));
}
