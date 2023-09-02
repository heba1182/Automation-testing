package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    //elements

    By registerPageField = By.className("ico-register");

    By genderField = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dayField = By.name("DateOfBirthDay");
    By monthField = By.name("DateOfBirthMonth");
    By yearField = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");

    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButtonField = By.id("register-button");
    By msgField = By.className("result");


    //actions
    public WebElement registerLink () {

        return Hooks.driver.findElement(registerPageField);
    }
    public WebElement gender() {
        return Hooks.driver.findElement(genderField);
    }

    public WebElement firstName() {
        return Hooks.driver.findElement(firstNameField);
    }

    public WebElement lastName() {
        return Hooks.driver.findElement(lastNameField);
    }

    public WebElement day() {
        return Hooks.driver.findElement(dayField);
    }

    public WebElement month() {
        return Hooks.driver.findElement(monthField);
    }
    public WebElement year() {
        return Hooks.driver.findElement(yearField);
    }
    public WebElement email () {
        return Hooks.driver.findElement(emailField);
    }
    public WebElement password () {
        return Hooks.driver.findElement(passwordField);
    }
    public WebElement confirmPassword () {
        return Hooks.driver.findElement(confirmPasswordField);
    }
    public WebElement registerButton () {
        return Hooks.driver.findElement(registerButtonField);
    }
    public WebElement msg (){
        return Hooks.driver.findElement(msgField);
    }
}
