package addToCart;

import addToCart.selenium.BaseSelenium;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by Ivan_Matsur on 3/11/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
    strict = true,
    plugin = {
        "pretty", "json:target/Cucumber.json",
        "html:target/cucumber-html-report"
    }
)

public class Runner {

  @BeforeClass
  public static void initSelenium(){
    BaseSelenium.init();
  }
  @AfterClass
  public static void closeSelenium(){
    BaseSelenium.close();
  }
}
