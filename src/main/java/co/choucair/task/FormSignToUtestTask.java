package co.choucair.task;

import co.choucair.models.FormSignToUtestData;
import co.choucair.utils.BaseConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;

import static co.choucair.ui.FormSignToUtestPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormSignToUtestTask extends BaseConfig implements Task {

    private List<FormSignToUtestData> data;

    public FormSignToUtestTask(List<FormSignToUtestData> data) {
        super(FormSignToUtestTask.class);
        this.data = data;
    }

    public static FormSignToUtestTask formSignToUtestTaskInstrumented(List<FormSignToUtestData> data) {
        return instrumented(FormSignToUtestTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getFirstName()).into(INPUT_FIRSNAME),
                Enter.theValue(data.get(0).getLastName()).into(INPUT_LASTNAME),
                Enter.theValue(data.get(0).getEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getMonth()).from(INPUT_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getDay()).from(INPUT_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getYear()).from(INPUT_YEAR),
                Scroll.to(BUTTON_NEXT),
                Click.on(BUTTON_NEXT)
        );
        BaseConfig.log.info("Execution of tasks and actions ["+this.getClass().getName()+"]");
    }
}
