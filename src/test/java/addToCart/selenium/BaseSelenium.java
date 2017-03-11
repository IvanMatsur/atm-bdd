package addToCart.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ivan_Matsur on 3/11/2017.
 */
public class BaseSelenium {

  public static WebDriver driver;

  public static void init() {
    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  public static void close() {
    try {
      driver.quit();
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      driver = null;
    }
  }
}