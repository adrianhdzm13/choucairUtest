package co.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("page:webdriver.base.url")
public class HomeJointTodayPage extends PageObject {
    public static final Target BUTTON_JOINTODAY =  Target.the("Button join today").locatedBy(".unauthenticated-nav-bar__sign-up");

}
