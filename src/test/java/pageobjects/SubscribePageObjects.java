package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SubscribePageObjects {

    public SubscribePageObjects(WebDriver driver) {
       PageFactory.initElements(driver, this);
    }
    @FindBy(how= How.NAME,using="Subscribe")
    public WebElement SubscribeButton;
    @FindBy(how= How.CSS,using=".subscription-package:nth-child(4)")
    public WebElement OnemonthButton;
    @FindBy(how= How.CSS,using=".position-r:nth-child(4) > .btn-type-2")
    public WebElement SubscribeButtonFreeTrail;
    @FindBy(how= How.NAME,using="FirstName")
    public WebElement FirstName;
    @FindBy(how= How.NAME,using="LastName")
    public WebElement LastName;
    @FindBy(how= How.NAME,using="EmailOrPhone")
    public WebElement EmailOrPhone;
    @FindBy(how= How.NAME,using="Password")
    public WebElement Password;
    @FindBy(how = How.CLASS_NAME, using = "custom-checkbox")
    public WebElement Checkbox;
    @FindBy(how = How.NAME, using = "bc-subscribe")
    public WebElement CreateAccount;
    @FindBy(how = How.CLASS_NAME, using = "form-close")
    public WebElement FormClose;
    @FindBy(how = How.NAME, using = "pay-now")
    public WebElement PayNow;
    @FindBy(how = How.NAME, using = "Ecom_Payment_Card_Name")
    public WebElement  CardName;
    @FindBy(how = How.NAME, using = "Ecom_Payment_Card_Number\n")
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
}
