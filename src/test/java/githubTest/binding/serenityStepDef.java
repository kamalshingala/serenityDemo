package githubTest.binding;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import githubTest.action.serenityUserSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by L046469 on 27/04/2016.
 */
public class serenityStepDef {

    @Steps
    serenityUserSteps autoTester;

    @Given("^User launches serenity reference page$")
    public void userLaunchesSerenityReferencePage() {
        autoTester.lunchSerenityReferencePage();
    }

    @When("^User Navigates to section2$")
    public void userNavigatesToSection() {
        autoTester.navigateToSection2();
    }

    @Then("^User is taken to '(.*)'$")
    public void userIsTakenToSection(String section) {
        autoTester.validateSection2IsVisible(section);
    }
}
