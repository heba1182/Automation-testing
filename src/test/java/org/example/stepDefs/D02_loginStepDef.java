package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login loginpage = new P02_login();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login page")
    public void userGoToLoginPage (){
     loginpage.loginLink().click();
    }

    @When("user login with email {string}")
    public void userLoginWithEmail (String email) {
        loginpage.email().sendKeys(email);
    }
    @And("user login with password {string}")
    public void userLoginWithPassword(String password) {
        loginpage.password().sendKeys(password);
    }
    @And("user press on login button")
    public void userPressOnLoginButton() {
        loginpage.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        String URL=  Hooks.driver.getCurrentUrl();
        softAssert.assertEquals("https://demo.nopcommerce.com/",URL);
        boolean value = loginpage.myAccount().isDisplayed();
        softAssert.assertTrue(value);
        softAssert.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String error_message = loginpage.errorMsg().getText();
        boolean error_value = error_message.contains("Login was unsuccessful.");
        softAssert.assertTrue(error_value);
        String error_color= loginpage.errorMsg().getCssValue("color");
        System.out.println(error_color);
        String hexcolor = Color.fromString("rgba(228, 67, 75, 1)").asHex();
        System.out.println(hexcolor);
        softAssert.assertEquals(hexcolor,"#e4434b");
        softAssert.assertAll();

    }


}
