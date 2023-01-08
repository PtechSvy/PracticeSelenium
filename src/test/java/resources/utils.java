package resources;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.Charset;
import java.time.Duration;
import java.util.Base64;
import java.util.Random;

public class utils extends LoggerForUi{

  public utils(WebDriver driver)
  {
      super(driver);
  }

    public static WebDriver driver;
    public static Actions action;
    public static Select select;
    public static JavascriptExecutor js;
    public static WebDriverWait wait;
    public static String AUTO = "AUTO";

  public static String setValueAuto(String value , boolean isSetAuto)
  {
    if((value==null) || value.isEmpty() && isSetAuto)
    {
      value = utils.AUTO;
    }
    if(value.equals(utils.AUTO))
    {
      return generateRandomValues();
    }
   return value;
  }


  public static String generateRandomValues()
  {
    byte[] array = new byte[7];
    new Random().nextBytes(array);
    String generatedString = new String(array, Charset.forName("UTF-8"));
    return  generatedString;
  }

  public static int generateRandomNumbers(int min , int max)
  {
    int number = (int)(Math.random()*(max-min+1)+min);
    return number;
  }

  public static String decodePassword(String val)
  {
    return new String(Base64.getDecoder().decode(val));
  }

  public static String generatePassword(String val1)
  {
    return new String(Base64.getEncoder().encode(val1.getBytes()));
  }

 public static void mouseHoverAncClick(WebElement element,WebDriver driver)
 {
     action = new Actions(driver);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(UtilsConstValues.FIVE_SECOND_IN_MSECOND));
     action.moveToElement(element).click().build().perform();
 }

 public static void clickOnHiddenElement(WebElement element)
 {
     js = (JavascriptExecutor)js;
     js.executeScript("arguments[0].click",element);
 }

 public static void scroll(WebElement element)
 {
     js = (JavascriptExecutor)js;
     js.executeScript("windows.scrollBy(0,1000)",element);
 }











}
