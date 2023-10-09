package co.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * This class contains the
 * definition of the web controls of the page.
 * @author fatencioccxc
 * @since  20/02/2023
 * @version 1.0.0
 * */
@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {

     /**
      * Definition of controls
      * */
     public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.id("dp-landing-home-login-button"));
     public static final Target CREATE_ACCOUNT_BUTTON = Target.the("Create account button").located(By.id("dp-landing-home-create-account-button"));
     //public static final Target SLOGAN = Target.the("HomePage slogan").located(By.xpath("//p[contains(text(),\""+Utils.convertUtf8("Diggitaliza tu negocio ¡Pásate a diggital!") +"\")]"));
}
