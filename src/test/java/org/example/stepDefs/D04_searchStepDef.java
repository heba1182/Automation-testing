package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage search = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();

    @Given("user insert productName {string} in search field")
    public void userInsertProductNameInSearchField(String productName) {
        search.search_field().sendKeys(productName);
    }

    @When("user press on search button")
    public void userPressOnSearchButton() {

        search.searchButton().click();
    }

    @Then("user get the result of search correctly {string}")
    public void userGetTheResultOfSearchCorrectly(String productName) {
       // softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("\"https://demo.nopcommerce.com/search?q"));
        search.products_count();
        System.out.println(search.products_count());
        for (int x = 0; x < search.products_count(); x++) {

            String nameOfProduct = search.products_name_list().get(x).getText();
            System.out.println(nameOfProduct);

            boolean value = nameOfProduct.toLowerCase().contains(productName);
            softAssert.assertTrue(value);

        }
        softAssert.assertAll();
    }

    @Given("user insert serial {string} in search field")
    public void userInsertSerialInSearchField(String sku) {
        search.search_field().sendKeys(sku);
    }

    @Then("user get the search result successfully {string}")
    public void userGetTheSearchResultSuccessfully(String serial) {
        search.product_title().click();

        String serialOfProduct = search.productSerial_number().getText();
        System.out.println(serialOfProduct);
        boolean value = serialOfProduct.contains(serial);
        softAssert.assertTrue(value);
        softAssert.assertAll();
    }


}
