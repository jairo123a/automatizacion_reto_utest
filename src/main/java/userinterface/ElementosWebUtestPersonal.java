package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebUtestPersonal {
    public static final Target NOMBRE=Target.the("Campo nombre").located(By.id("firstName"));
    public static final Target APELLIDO=Target.the("Campo apellido").located(By.id("lastName"));
    public static final Target Correo=Target.the("Campo correo").located(By.id("email"));
    public static final Target MES=Target.the("Campo mes").located(By.id("birthMonth"));
    public static final Target DIA=Target.the("Campo dia").located(By.id("birthDay"));
    public static final Target ANO=Target.the("Campo ano").located(By.id("birthYear"));
    public static final Target NEXT_LOCATION=Target.the("Boton next location").located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
