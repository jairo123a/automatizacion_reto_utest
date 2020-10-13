package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebUtestPrincipal {
    public static final Target REGISTRAR=Target.the("boton registrar").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
