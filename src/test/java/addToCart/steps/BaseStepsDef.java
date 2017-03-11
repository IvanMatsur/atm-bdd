package addToCart.steps;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;

import addToCart.selenium.BaseSelenium;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Ivan_Matsur on 3/11/2017.
 */
public class BaseStepsDef extends BaseSelenium {

  @Given("^I set search request \"([^\"]*)\"$")
  public void iSetSearchRequest(String searchRequest) {
    driver.get("http://ebay.com");
    driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys(searchRequest);
  }

  @When("^I perform search$")
  public void iPerformSearch() {
    driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
  }

  @And("^I open the top offer$")
  public void iOpenTheTopOffer() {
    driver.findElement(By.xpath("//li[@r='1']/h3/a")).click();
  }

  @And("^I add the item to cart$")
  public void iAddTheItemToCart() {
    driver.findElement(By.xpath("//a[@id='isCartBtn_btn']")).click();
  }

  @Then("^the item \"([^\"]*)\" should be added to my cart$")
  public void theItemShouldBeAddedToMyCart(String expectedPhrase) {
    String message = driver.findElement(By.xpath("//div[contains(@class, 'msgWrapper')]//a")).getText().toLowerCase();
    assertThat(message, containsString(expectedPhrase.toLowerCase()));
  }
}
