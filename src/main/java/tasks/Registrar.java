package tasks;

import model.UtestUsuarioDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.*;
import util.Constantes;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Registrar implements Task {

   List<UtestUsuarioDataModel>  losdatos;
    public Registrar(List<UtestUsuarioDataModel> losdatos) {
        this.losdatos=losdatos;
    }

    public static Registrar unUsuarioCon(List<UtestUsuarioDataModel> losdatos) {
        return new Registrar(losdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementosWebUtestPrincipal.REGISTRAR),
                Enter.theValue(losdatos.get(Constantes.POSICION).getNombre()).into(ElementosWebUtestPersonal.NOMBRE),
                Enter.theValue(losdatos.get(Constantes.POSICION).getNombre()).into(ElementosWebUtestPersonal.NOMBRE),
                Enter.theValue(losdatos.get(Constantes.POSICION).getApellido()).into(ElementosWebUtestPersonal.APELLIDO),
                Enter.theValue(losdatos.get(Constantes.POSICION).getCorreo()).into(ElementosWebUtestPersonal.Correo),
                SelectFromOptions.byVisibleText(losdatos.get(Constantes.POSICION).getMes()).from(ElementosWebUtestPersonal.MES),
                SelectFromOptions.byVisibleText(losdatos.get(Constantes.POSICION).getDia()).from(ElementosWebUtestPersonal.DIA),
                SelectFromOptions.byVisibleText(losdatos.get(Constantes.POSICION).getAno()).from(ElementosWebUtestPersonal.ANO),
                Click.on(ElementosWebUtestPersonal.NEXT_LOCATION),
                WaitUntil.the(ElementosWebUtestLocation.ESPERA_LOCATION,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ElementosWebUtestLocation.NEXT_DEVICE),
                Click.on(ElementosWebUtesDevice.NEXT_LAST),
                Enter.theValue(losdatos.get(Constantes.POSICION).getPassword()).into(ElementosWebUtestLast.PASSWORD),
                Enter.theValue(losdatos.get(Constantes.POSICION).getConfirmarpass()).into(ElementosWebUtestLast.CONFIRMAR_PASSWORD),
                Click.on(ElementosWebUtestLast.CHECK1),
                Click.on(ElementosWebUtestLast.CHECK2),
                Click.on(ElementosWebUtestLast.COMPLETE)
        );
    }
}
