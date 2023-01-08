package PracticeScenarios;

import UIPages.LoginPage;
import WebUiAutomation.BaseTest;
import com.aventstack.extentreports.service.ExtentTestManager;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.readDataFromXcel;


public class TestForLoginPortal extends BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void setupTestData () {
        //Set Test Data Excel and Sheet
        System.out.println("************Setup Test Level Data**********");
        readDataFromXcel.setExcelFileSheet("LoginData" , testDataExcelFileName);
        driver = setUp();

    }

    @Test(priority = 0)
    public void testLogin()  {
      //  ExtentTestManager.getTest().info("Invalid Login Scenario with wrong username and password");
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        LoginPage lgn = PageFactory.initElements(driver, LoginPage.class);
        lgn.login();
        lgn.enterPswd();


    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
