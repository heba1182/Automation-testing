package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    //elements
 By loginPageField = By.className("ico-login");
 By emailField = By.id("Email");
 By passwordField = By.id("Password");

 By loginButtonField = By.className("login-button");
 By myAccountField = By.className("ico-account");
 By errorMsgField = By.className("message-error");

    //actions
    public WebElement loginLink() {
        return Hooks.driver.findElement(loginPageField);

    }

    public WebElement email() {
        return Hooks.driver.findElement(emailField);
    }

    public WebElement password() {
        return Hooks.driver.findElement(passwordField);
    }

    public WebElement loginButton() {
        return Hooks.driver.findElement(loginButtonField);
    }
    public WebElement myAccount (){
        return Hooks.driver.findElement(myAccountField);
    }
    public WebElement errorMsg (){
        return Hooks.driver.findElement(errorMsgField);
    }
}
