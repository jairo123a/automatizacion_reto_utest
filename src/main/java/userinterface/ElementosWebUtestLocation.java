package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebUtestLocation {
    public static final Target ESPERA_LOCATION=Target.the("label autocomplete").located(By.xpath("//span[@class='check-mark']"));
    public static final Target NEXT_DEVICE=Target.the("boton next device").located(By.xpath("//span[contains(text(),'Next: Devices')]"));
}
