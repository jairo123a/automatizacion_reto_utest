package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebUtestLast {
    public static final Target PASSWORD=Target.the("Campo password").located(By.id("password"));
    public static final Target CONFIRMAR_PASSWORD=Target.the("campo confirmar password").located(By.id("confirmPassword"));
    public static final Target CHECK1=Target.the("Campo check").located(By.id("termOfUse"));
    public static final Target CHECK2=Target.the("Campo check").located(By.id("privacySetting"));
    public static final Target COMPLETE=Target.the("boton complete").located(By.id("laddaBtn"));
}
