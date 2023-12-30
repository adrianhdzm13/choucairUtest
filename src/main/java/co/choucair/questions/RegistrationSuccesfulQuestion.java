package co.choucair.questions;


import co.choucair.ui.LastStepPage;
import co.choucair.utils.BaseConfig;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class RegistrationSuccesfulQuestion extends BaseConfig {

    public RegistrationSuccesfulQuestion() {
        super(RegistrationSuccesfulQuestion.class);
    }

    public static Question<String> titleOfRegistrationSuccesful() {
        log.info("Title registration succesful ["+ RegistrationSuccesfulQuestion.class.getName()+"]");
        return actor -> TextContent.of(LastStepPage.TEXT_REGISTRATION).
                viewedBy(actor).asString().toString().trim();
    }

    
}

