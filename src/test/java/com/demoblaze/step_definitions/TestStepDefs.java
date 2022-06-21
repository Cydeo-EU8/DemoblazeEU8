package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

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
    }
    @And("buyer clicks on {string} link")
    public void buyer_clicks_on_link(String link) {

    }
}
