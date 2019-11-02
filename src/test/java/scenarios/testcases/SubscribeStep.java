package scenarios.testcases;

import com.google.common.eventbus.Subscribe;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SubscribePageObjects;
import scenarios.base.StepManager;

public class SubscribeStep extends StepManager {
    private SubscribePageObjects subscribePage;
    public SubscribeStep() {
        super("subscribe");
        subscribePage = PageFactory.initElements(this.driver, SubscribePageObjects.class);
        set_timeOutValue(10);
    }

    @Given("^a web browser is at the BeinSportsConnect home page$")
    public void aWebBrowserIsAtTheBeinSportsConnectHomePage() {
        getUrl();
    }

    @When("^user clicks subscribe button and selects Monthly Pass with One Week Free Trial$")
    public void userClicksSubscribeButtonAndSelectsMonthlyPassWithOneWeekFreeTrial() {
        elementClick(subscribePage.subscribebutton);
        elementClick(subscribePage.onemontbutton);
        elementClick(subscribePage.subscribebuttonfreetrail);
    }

    @And("^user fiils user information detail and click create account button$")
    public void userFiilsUserInformationDetailAndClickCreateAccountButton() {
        getElement(subscribePage.FirstName).sendKeys("Sevilay"+randomGenerator.nextInt(10));
        getElement(subscribePage.LastName).sendKeys("Test beinSports");
        getElement(subscribePage.EmailOrPhone).sendKeys("sevilay"+randomGenerator.nextInt(100)+ "@gmail.com" );
        getElement(subscribePage.Password).sendKeys("Sa5895"+randomGenerator.nextInt());
        elementClick(subscribePage.Checkbox);
        elementClick(subscribePage.createaccount);
        WebElement iFrame = driver.findElement(By.className("captcha-container"));
        driver.switchTo().frame(iFrame);
        WebElement iFrame_checkbox = driver.findElement(By.className("recaptcha-checkbox-border"));
        iFrame_checkbox.click();
        elementClick(subscribePage.formClose);

    }

    @And("^user fills card detail and clicks confirm payment method$")
    public void userFillsCardDetailAndClicksConfirmPaymentMethod() {
        elementClick(subscribePage.Checkbox);
        elementClick(subscribePage.paynow);
        getElement(subscribePage.Card_Name).sendKeys("Sevilay Test");
        getElement(subscribePage.Card_Number).sendKeys("12023392323828");
        elementClick(subscribePage.Card_ExpDate_Month);
        elementClick(subscribePage.selectmonth);
        elementClick(subscribePage.Card_ExpDate_Year);
        elementClick(subscribePage.selectyear);
        getElement(subscribePage.Card_Verification).sendKeys("120");
        elementClick(subscribePage.confirmpaymentbutton);

    }

    @Then("^user shows error popup$")
    public void userShowsErrorPopup() {
        System.out.println ("popup gorundu");
    }
}
