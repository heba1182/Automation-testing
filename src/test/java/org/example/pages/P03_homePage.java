package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    //elements
//search
By searchField = By.id("small-searchterms");

By searchButtonField = By.cssSelector("button[class=\"button-1 search-box-button\"]");
By skuField = By.cssSelector("div[class=\"additional-details\"] span[id]");
By listOfAllProducts = By.xpath("//h2[@class='product-title']/a");

//followUs
By facebookLinkField = By.linkText("Facebook");
    By twitterLinkField = By.linkText("Twitter");
    By rssLinkField = By.linkText("RSS");
    By youtubeLinkField = By.linkText("YouTube");

//actions
    //search
    public WebElement search_field () {

        return Hooks.driver.findElement(searchField);
    }
    public WebElement searchButton() {
        return Hooks.driver.findElement(searchButtonField);
    }
    public int products_count() {
        int count = Hooks.driver.findElements(By.xpath("//h2[@class='product-title']/a")).size();
        return count;
    }
    public List<WebElement> products_name_list() {
        List<WebElement> products_name = Hooks.driver.findElements(listOfAllProducts);
        return products_name;
    }
    public  WebElement product_title(){
        return Hooks.driver.findElement(By.xpath("//h2[@class='product-title']/a"));
    }
    public WebElement productSerial_number(){
        return Hooks.driver.findElement(skuField);
    }

    //followUs

    public WebElement FacebookLink(){
        return Hooks.driver.findElement(facebookLinkField);
    }
    public WebElement TwitterLink(){
        return Hooks.driver.findElement(twitterLinkField);
    }
    public WebElement RssLink(){
        return Hooks.driver.findElement(rssLinkField);
    }
    public WebElement YoutubeLink(){
        return Hooks.driver.findElement(youtubeLinkField);
    }

}
