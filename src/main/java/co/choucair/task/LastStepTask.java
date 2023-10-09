package co.choucair.task;

import co.choucair.iteractions.PerformWait;
import co.choucair.models.LastStepData;
import co.choucair.utils.BaseConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import java.util.List;
import static co.choucair.ui.LastStepPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LastStepTask extends BaseConfig implements Task {


    private List<LastStepData> data;

    public LastStepTask(List<LastStepData> data) {
        super(LastStepTask.class);
        this.data = data;
    }

    public static LastStepTask LastStepTaskInstrumented(List<LastStepData> data) {
        return instrumented(LastStepTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PerformWait.wait(1),
                Enter.theValue(data.get(0).getCreateYourUTestpassword()).into(INPUT_PASSWORD),
                Enter.theValue(data.get(0).getConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                Scroll.to(CHECK_READ_ACCEPT_PRIVACY),
                Click.on(CHECK_READ_ACCEPT_PRIVACY),
                Click.on(CHECK_READ_ACCEPT_TERMS),
                Click.on(BUTTON_COMPLETE_SETUP),
                PerformWait.wait(2),
                Scroll.to(TEXT_REGISTRATION),
                PerformWait.wait(1)
        );
        BaseConfig.log.info("Execution of tasks and actions [" + this.getClass().getName() + "]");
    }
}
