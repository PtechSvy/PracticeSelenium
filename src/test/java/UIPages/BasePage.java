package UIPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;

    }

    //Click Method
    public void click (By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void writeText (WebElement element, String text) {
      //  driver.findElement((By) element).sendKeys(text);
        element.sendKeys(text);
    }

    //Read Text
    public String readText (By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }
}
