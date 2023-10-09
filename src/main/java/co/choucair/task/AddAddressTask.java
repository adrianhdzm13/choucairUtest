package co.choucair.task;

import co.choucair.iteractions.PerformWait;
import co.choucair.utils.BaseConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.choucair.ui.AddAddressPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddAddressTask extends BaseConfig implements Task {


    public AddAddressTask() {
        super(AddAddressTask.class);
    }

    public static AddAddressTask addAddressTaskInstrumented() {
        return instrumented(AddAddressTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PerformWait.wait(3),
                Scroll.to(BUTTON_NEXT_DEVICES),
                Click.on(BUTTON_NEXT_DEVICES)
        );
        BaseConfig.log.info("Execution of tasks and actions ["+this.getClass().getName()+"]");
    }
}