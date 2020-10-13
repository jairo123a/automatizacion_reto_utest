package Prueba.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.UtestUsuarioDataModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.PreguntaUsuario;
import tasks.Abrir;
import tasks.Registrar;

import java.util.List;

public class UtestStepDefinition {
    @Dado("^que un usuario ingresa al sitio web$")
    public void queUnUsuarioIngresaAlSitioWeb() {
        OnStage.theActorCalled("usuario").wasAbleTo(Abrir.laPagina());
    }


    @Cuando("^el Diligencia un formulario y registra un usuario$")
    public void elDiligenciaUnFormularioYRegistraUnUsuario(List<UtestUsuarioDataModel> losdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrar.unUsuarioCon(losdatos));
    }

    @Entonces("^el verifica el registro exitoso\"([^\"]*)\"$")
    public void elVerificaElRegistroExitoso(String confirmar) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaUsuario.seRegistro(confirmar)));
    }

}
