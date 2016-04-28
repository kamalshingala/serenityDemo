package githubTest.action;


import githubTest.framework.serenityPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class serenityUserSteps extends ScenarioSteps {

    serenityPage serenityPage;

    @Step
    public void lunchSerenityReferencePage(){
        serenityPage.open();
    }

    @Step
    public void navigateToSection2(){
        serenityPage.navigateToSection2();
    }

    @Step
    public void validateSection2IsVisible(String section){
        assertEquals(section,serenityPage.getSection2Header());
    }

}