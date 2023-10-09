package co.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LastStepPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("Input password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input  confirm password").located(By.id("confirmPassword"));
    public static final Target CHECK_READ_ACCEPT_TERMS = Target.the("Check accept terms").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target CHECK_READ_ACCEPT_PRIVACY = Target.the("Check acccept privacy").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[2]"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Button complete setup").located(By.id("laddaBtn"));
    public static final Target TEXT_REGISTRATION = Target.the("Button complete setup").located(By.xpath("//strong[contains(text(),'Participate in the')]"));

}
