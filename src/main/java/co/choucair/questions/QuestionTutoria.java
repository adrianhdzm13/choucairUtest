package co.choucair.questions;

import co.choucair.ui.LastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuestionTutoria implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        return LastStepPage.TEXT_REGISTRATION.resolveFor(actor).getText();
    }
    public static Question<String> answer() {
        return  new QuestionTutoria();
    }

}
