package UIPages;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.UtilsConstValues;
import resources.utils;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    public WebDriverWait wait;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH,using = "//input[@id='text']")
    WebElement UserName;

    @FindBy(how = How.XPATH ,using = "//input[@id='password']")
    WebElement Passwrd;

    @FindBy(how = How.XPATH,using = "//*[@id='login-button']")
    WebElement SbmtBttn;


    public void login()
    {
        driver.get("http://webdriveruniversity.com/Login-Portal/index.html");
        wait = new WebDriverWait(driver, Duration.ofSeconds(UtilsConstValues.TWO_SECOND_IN_MSECOND));
        UserName.sendKeys("Piyali");
        wait = new WebDriverWait(driver, Duration.ofSeconds(UtilsConstValues.TWO_SECOND_IN_MSECOND));
    }

    public void enterPswd()
    {
        String password = "UGl5YUBwYXdhbjYw";
        String val = utils.decodePassword(password);
        Passwrd.sendKeys(val);
        wait = new WebDriverWait(driver, Duration.ofSeconds(UtilsConstValues.TWO_SECOND_IN_MSECOND));
        SbmtBttn.click();
    }
}
