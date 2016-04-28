package githubTest.framework;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://thucydides.info/docs/serenity-staging/")
public class serenityPage extends PageObject {

    @FindBy(xpath = "//a[@href='#basic-concepts']")
    private WebElementFacade section2;

    @FindBy(xpath = "//h2[@id=\"basic-concepts\"]")
    private WebElementFacade section2Header;

    @WhenPageOpens
    public void onOpen() {
        setImplicitTimeout(15, TimeUnit.SECONDS);
    }

    public void navigateToSection2(){
        section2.click();
    }

    public String getSection2Header(){
        return section2Header.getText();
    }
}