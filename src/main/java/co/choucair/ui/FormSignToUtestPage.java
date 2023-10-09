package co.choucair.ui;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormSignToUtestPage extends PageObject {

    public static final Target INPUT_FIRSNAME = Target.the("Input firs name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Input last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Input email").located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("Input month").located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Input day").located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Input year").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("Button next:Location").located(By.cssSelector("a[class='btn btn-blue']"));

}

