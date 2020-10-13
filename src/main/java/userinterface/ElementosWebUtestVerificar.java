package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebUtestVerificar {
    public static final Target VERIICACION=Target.the("Elemento para verificar").located(By.xpath("//h1[contains(text(),\'Welcome to the world's largest community of freela\')]"));
}
