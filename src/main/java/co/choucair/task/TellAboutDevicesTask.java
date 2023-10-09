package co.choucair.task;

import co.choucair.iteractions.PerformWait;
import co.choucair.utils.BaseConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.choucair.ui.TellAboutDevicesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TellAboutDevicesTask extends BaseConfig implements Task {


    public TellAboutDevicesTask() {
        super(TellAboutDevicesTask.class);
    }

    public static TellAboutDevicesTask tellAboutDevicesTaskInstrumented() {
        return instrumented(TellAboutDevicesTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PerformWait.wait(3),
                Scroll.to(BUTTON_NEXT_LAST_STEP),
                Click.on(BUTTON_NEXT_LAST_STEP)
        );
        BaseConfig.log.info("Execution of tasks and actions ["+this.getClass().getName()+"]");
    }
}
