package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebUtestVerificar;

public class PreguntaUsuario implements Question<Boolean> {

   String pregunta;
    public PreguntaUsuario(String confirmar) {
        pregunta=confirmar;
    }

    public static PreguntaUsuario seRegistro(String confirmar) {
        return new PreguntaUsuario(confirmar);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String respuesta;
        respuesta= Text.of(ElementosWebUtestVerificar.VERIICACION).viewedBy(actor).asString();
        if(respuesta.equals(pregunta)){
            return true;
        }else{
            return false;
        }
    }
}
