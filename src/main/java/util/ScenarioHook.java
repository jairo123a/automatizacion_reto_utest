package util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ScenarioHook {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
