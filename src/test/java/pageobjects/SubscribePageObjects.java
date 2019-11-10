package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubscribePageObjects {

  @FindBy(how = How.ID, using = "loading")
  public WebElement ImageLoading;

  @FindBy(how = How.NAME, using = "Subscribe")
  public WebElement SubscribeButton;

  @FindBy(
      how = How.CSS,
      using = "body > div.layout-wide > div.container-onboarding.step1 > div:nth-child(5)")
  public WebElement OnemonthButton;

  @FindBy(how = How.CSS, using = ".position-r:nth-child(4) > .btn-type-2")
  public WebElement SubscribeButtonFreeTrail;

  @FindBy(how = How.CLASS_NAME, using = "external-login-button")
  public WebElement ExternalLoginButton;

  @FindBy(how = How.NAME, using = "FirstName")
  public WebElement FirstName;

  @FindBy(how = How.NAME, using = "LastName")
  public WebElement LastName;

  @FindBy(how = How.NAME, using = "EmailOrPhone")
  public WebElement EmailOrPhone;

  @FindBy(how = How.NAME, using = "Password")
  public WebElement Password;

  @FindBy(how = How.ID, using = "chkAllow")
  public WebElement Checkbox;

  @FindBy(how = How.ID, using = "overlay-player")
  public WebElement OverlayPlayer;

  @FindBy(
      how = How.CSS,
      using = "form#form-register > div > div:nth-of-type(2) > div:nth-of-type(11) > input")
  public WebElement CreateAccount;

  @FindBy(how = How.CLASS_NAME, using = "form-close")
  public WebElement FormClose;

  @FindBy(how = How.NAME, using = "pay-now")
  public WebElement PayNow;

  @FindBy(how = How.NAME, using = "Ecom_Payment_Card_Name")
  public WebElement CardName;

  @FindBy(how = How.NAME, using = "Ecom_Payment_Card_Number")
  public WebElement CardNumber;

  @FindBy(how = How.NAME, using = "Ecom_Payment_Card_ExpDate_Month")
  public WebElement CardExpDateMonth;

  @FindBy(how = How.CSS, using = "#Ecom_Payment_Card_ExpDate_Month > option:nth-child(3)")
  public WebElement SelectMonth;

  @FindBy(how = How.ID, using = "Ecom_Payment_Card_ExpDate_Year")
  public WebElement CardExpDateYear;

  @FindBy(how = How.CSS, using = "#Ecom_Payment_Card_ExpDate_Year > option:nth-child(2)")
  public WebElement SelectYear;

  @FindBy(how = How.ID, using = "Ecom_Payment_Card_Verification")
  public WebElement CardVerification;

  @FindBy(how = How.NAME, using = "payment")
  public WebElement ConFirmPaymentButton;

  @FindBy(how = How.CLASS_NAME, using = "subscription-package")
  public WebElement PaymentMethodBox;
}
