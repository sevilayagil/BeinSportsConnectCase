package scenarios.testcases;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.SubscribePageObjects;
import scenarios.base.StepManager;

import java.util.concurrent.TimeUnit;

public class SubscribeStep extends StepManager {
  private SubscribePageObjects subscribePage;

  public SubscribeStep() {
    super("subscribe");
    subscribePage = PageFactory.initElements(this.driver, SubscribePageObjects.class);
    set_timeOutValue(5000);
  }

  @Given("^a web browser is at the BeinSportsConnect home page$")
  public void aWebBrowserIsAtTheBeinSportsConnectHomePage() {
    getUrl();
  }

  @When("^user clicks subscribe button and selects Monthly Pass with One Week Free Trial$")
  public void userClicksSubscribeButtonAndSelectsMonthlyPassWithOneWeekFreeTrial() {
    elementinvisible(subscribePage.ImageLoading);
    elementClick(subscribePage.SubscribeButton);
    elementinvisible(subscribePage.ImageLoading);
    elementClick(subscribePage.OnemonthButton);
    elementinvisible(subscribePage.ImageLoading);
    PageScrolldown();
    elementClick(subscribePage.SubscribeButtonFreeTrail, TimeOut.LOW);
  }

  @And("^user fills user information detail and click create account button$")
  public void userFillsUserInformationDetailAndClickCreateAccountButton()
      throws InterruptedException {
    waitElemntCssControl(subscribePage.ImageLoading, "display", "none");
    System.out.println(subscribePage.ImageLoading.getCssValue("display"));
    elementinvisible(subscribePage.ImageLoading, TimeOut.MAX_MAX);
    elementVisible(subscribePage.ImageLoading);
    elementinvisible(subscribePage.ImageLoading, TimeOut.MAX_MAX);
    getElement(subscribePage.ExternalLoginButton).isDisplayed();
    getElement(subscribePage.FirstName).sendKeys("sevilay" + randomGenerator.nextInt(10));
    getElement(subscribePage.LastName).sendKeys("Test beinSports");
    getElement(subscribePage.EmailOrPhone)
        .sendKeys("sevilay" + randomGenerator.nextInt(100) + "@gmail.com");
    getElement(subscribePage.Password).sendKeys("Sa5895" + randomGenerator.nextInt(10));
    customCheckboxGenerateWebDriver();

    //        WebElement iFrame = driver.findElement(By.className("captcha-container"));
    //        driver.switchTo().frame(iFrame);
    //        WebElement iFrame_checkbox =
    // driver.findElement(By.className("recaptcha-checkbox-border"));
    //        iFrame_checkbox.click();
    //        elementClick(subscribePage.FormClose);
  }

  private void customCheckboxGenerateWebDriver() {
    WebElement element =
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div[2]/div[8]/div[1]"));
    element.click();
  }

  @And("^user fills card detail and clicks confirm payment method$")
  public void userFillsCardDetailAndClicksConfirmPaymentMethod() {
    elementClick(subscribePage.Checkbox);
    elementClick(subscribePage.PayNow);
    getElement(subscribePage.CardName).sendKeys("Sevilay Test");
    getElement(subscribePage.CardNumber).sendKeys("12023392323828");
    elementClick(subscribePage.CardExpDateMonth);
    elementClick(subscribePage.SelectMonth);
    elementClick(subscribePage.CardExpDateYear);
    elementClick(subscribePage.SelectYear);
    getElement(subscribePage.CardVerification).sendKeys("120");
    elementClick(subscribePage.ConFirmPaymentButton);
  }

  @Then("^user shows error popup$")
  public void userShowsErrorPopup() {
    driver.switchTo().alert().dismiss();
  }
}
