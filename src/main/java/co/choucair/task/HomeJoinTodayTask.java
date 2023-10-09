package co.choucair.task;

import co.choucair.utils.BaseConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.choucair.ui.HomeJointTodayPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeJoinTodayTask extends BaseConfig implements Task {


    public HomeJoinTodayTask() {
        super(HomeJoinTodayTask.class);
    }

    public static HomeJoinTodayTask joinTodayTaskTaskInstrumented() {
        return instrumented(HomeJoinTodayTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_JOINTODAY)
        );
        BaseConfig.log.info("Execution of tasks and actions ["+this.getClass().getName()+"]");
    }
}
