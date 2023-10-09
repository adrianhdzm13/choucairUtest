package co.choucair.stepsDefinitions;

import co.choucair.models.FormSignToUtestData;
import co.choucair.models.LastStepData;
import co.choucair.questions.RegistrationSuccesfulQuestion;
import co.choucair.task.*;
import co.choucair.ui.HomePage;
import co.choucair.utils.BaseConfig;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.choucair.utils.Utils.convertUtf8;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class JoinTodaySteps extends BaseConfig {

    public JoinTodaySteps() {
        super(JoinTodaySteps.class);
    }

    @DataTableType
    public FormSignToUtestData convert(Map<String,String> ent) {
        BaseConfig.log.info("Dataset registration ["+this.getClass().getName()+"]");
        return new FormSignToUtestData(
                ent.get("firstName"),
                ent.get("lastName"),
                ent.get("email"),
                ent.get("month"),
                ent.get("day"),
                ent.get("year")
        );
    }

    @Before
    public void SetTheStage() {
        BaseConfig.log.info("Application start ["+this.getClass().getName()+"]");
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("I am on the Utest site")
    public void iAmOnTheUtestSite() {
        HomePage homePage = new HomePage();
        String actorName = "Utest user";
        theActorCalled(actorName).wasAbleTo(Open.browserOn(homePage));
    }

    @When("I click on the Join Today button")
    public void iClickOnTheJoinTodayButton() {
        theActorInTheSpotlight().attemptsTo(
                HomeJoinTodayTask.joinTodayTaskTaskInstrumented()
        );
    }

    @Then("I should see the registration form")
    public void iShouldSeeTheRegistrationForm() {

    }

    @When("^Enter the following information:$")
    public void enterTheFollowingInformation(List<FormSignToUtestData> data) {
        theActorInTheSpotlight().attemptsTo(
                FormSignToUtestTask.formSignToUtestTaskInstrumented(data)
        );
    }


    @When("I click the Next:Devices button")
    public void iClickTheNextDevicesButton() {
        theActorInTheSpotlight().attemptsTo(
                AddAddressTask.addAddressTaskInstrumented()
        );
    }

    @When("I click the Next:Last Step button")
    public void iClickTheNextLastStepButton() {
        theActorInTheSpotlight().attemptsTo(
                TellAboutDevicesTask.tellAboutDevicesTaskInstrumented()
        );
    }

    @DataTableType
    public LastStepData convert2(Map<String,String> ent) {
        BaseConfig.log.info("Dataset registration ["+this.getClass().getName()+"]");
        return new LastStepData(
                ent.get("createYourUTestpassword"),
                ent.get("confirmPassword")
        );
    }

    @When("Enter the credentials in the fields:")
    public void enterTheCredentialsInTheFields(List<LastStepData> data) {
        theActorInTheSpotlight().attemptsTo(
                LastStepTask.LastStepTaskInstrumented(data)
        );
    }


    @Then("I should be successfully registred {string}")
    public void iShouldBeSuccessfullyRegistred(String text) {
        theActorInTheSpotlight().should(
                seeThat(
                        "Participate in",
                        RegistrationSuccesfulQuestion.titleOfRegistrationSuccesful(),
                        equalTo(convertUtf8(text))
                )
        );
    }

}
