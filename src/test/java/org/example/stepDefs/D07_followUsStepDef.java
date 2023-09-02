package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage followUs = new P03_homePage();
    WebDriverWait wait;

    @When("user opens facebook link")
    public void userOpensfacebooklink() {
        followUs.FacebookLink().click();

    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String Expected_URL) {
        wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        String actual_URL = Hooks.driver.getCurrentUrl();

        System.out.println(actual_URL);
        Assert.assertEquals(actual_URL, Expected_URL);
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        followUs.TwitterLink().click();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        followUs.RssLink().click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        followUs.YoutubeLink().click();
    }
}
