package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestStepDefs {
    ProductPage productPage = new ProductPage();
    @Given("buyer is on the homepage of demoblaze")
    public void buyer_is_on_the_homepage_of_demoblaze() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("buyer adds from {string} category {string} product to cart")
    public void buyer_adds_from_category_product_to_cart(String category, String product) {
        productPage.getLink(category);
        productPage.getLink(product);
        productPage.getLink("Add to cart");
        // handle alert
       // BrowserUtils.sleep(1); static wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @And("buyer clicks on {string} link")
    public void buyer_clicks_on_link(String link) {
        productPage.getLink(link);
    }

    @Then("buyer should see {string} is added to cart")
    public void buyerShouldSeeIsAddedToCart(String product) {

        Assert.assertTrue(productPage.getProductElement(product).isDisplayed());

    }
}
