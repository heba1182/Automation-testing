package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register registerpage = new P01_register();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to register page")
    public void userGoToRegisterPage() {

        registerpage.registerLink().click();

    }

    @When("user select gender type")
    public void userSelectGenderType() {

       registerpage.gender().click();
    }

    @And("user enter firstName {string}")
    public void userEnterFirstName(String firstName) {

        registerpage.firstName().sendKeys(firstName);
    }

    @And("user enter lastName {string}")
    public void userEnterLastName(String lastName) {

        registerpage.lastName().sendKeys(lastName);
    }


    @And("user enter date of birth")
    public void userEnterDateOfBirth() throws InterruptedException {

       WebElement day = registerpage.day();
        Select daynum = new Select(day);
        Thread.sleep(2000);
        daynum.selectByValue("1");
        WebElement month = registerpage.month();
        Select monthnum = new Select(month);
        Thread.sleep(2000);
        monthnum.selectByValue("11");
        WebElement year = registerpage.year();
        Select yearnum = new Select(year);
        Thread.sleep(2000);
        yearnum.selectByValue("2020");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {

       registerpage.email().sendKeys(email);

    }

    @And("user fills password field {string}")
    public void userFillsPasswordField(String password) {
         registerpage.password().sendKeys(password);
    }

    @And("user fills confirmPassword field {string}")
    public void userFillsConfirmPasswordField(String confirmPassword) {
         registerpage.confirmPassword().sendKeys(confirmPassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {


      registerpage.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        String color = registerpage.msg().getCssValue("color");
        softAssert.assertEquals(color,"rgba(76, 177, 124, 1)");
        boolean value = registerpage.msg().isDisplayed();
        softAssert.assertTrue(value);
        softAssert.assertAll();

    }



}
