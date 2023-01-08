package WebUiAutomation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.UtilsConstValues;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public WebDriverWait wait;
    public static final String testDataExcelFileName = "TestData.xlsx";


    public WebDriver setUp()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(UtilsConstValues.FIVE_SECOND_IN_MSECOND));
        driver.manage().window().maximize();
        return driver;

    }



}
