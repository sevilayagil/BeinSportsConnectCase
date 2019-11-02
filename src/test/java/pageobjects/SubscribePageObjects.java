package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SubscribePageObjects {
    final WebDriver driver;
    public SubscribePageObjects(WebDriver driver) {
       this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how= How.NAME,using="Subscribe")
    public WebElement subscribebutton;
    @FindBy(how= How.CSS,using="div[class='subscription-package'] [data-index='2']")
    public WebElement onemontbutton;
    @FindBy(how= How.XPATH,using="/*[@class='position-r]//*[data-btn-index='1']")
    public WebElement subscribebuttonfreetrail;
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
    public WebElement createaccount;
    @FindBy(how = How.CLASS_NAME, using = "form-close")
    public WebElement formClose;
    @FindBy(how = How.NAME, using = "pay-now")
    public WebElement paynow;
    @FindBy(how = How.NAME, using = "Ecom_Payment_Card_Name")
    public WebElement  Card_Name;
    @FindBy(how = How.NAME, using = "Ecom_Payment_Card_Number\n")
    public WebElement Card_Number;
    @FindBy(how = How.NAME, using = "Ecom_Payment_Card_ExpDate_Month")
    public WebElement Card_ExpDate_Month;
    @FindBy(how = How.CSS, using = "#Ecom_Payment_Card_ExpDate_Month > option:nth-child(3)")
    public WebElement selectmonth;
    @FindBy(how = How.ID, using = "Ecom_Payment_Card_ExpDate_Year")
    public WebElement Card_ExpDate_Year;
    @FindBy(how = How.CSS, using = "#Ecom_Payment_Card_ExpDate_Year > option:nth-child(2)")
    public WebElement selectyear;
    @FindBy(how = How.ID, using = "Ecom_Payment_Card_Verification")
    public WebElement Card_Verification;
    @FindBy(how = How.NAME, using = "payment")
    public WebElement confirmpaymentbutton;


}
