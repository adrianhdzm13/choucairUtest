package co.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddAddressPage extends PageObject {

    public static final Target BUTTON_NEXT_DEVICES = Target.the("Button next devices").located(By.xpath("//i[contains(text(),'_right')]"));
}
