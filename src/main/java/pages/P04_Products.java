package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_Products {
    //TODO: 1- Define Webdriver
    WebDriver driver;

    //TODO: 2- Define Constructor and set value of webdriver

    public P04_Products(WebDriver driver) {
        this.driver = driver;
    }



    private final By AddToCart=By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]");

    public P04_Products clickaddtocart(){
        driver.findElement(this.AddToCart).click();
        return this;
    }

    private final By AddToCartII=By.id("button-cart");

    public P04_Products clickaddtocartII(){
        driver.findElement(this.AddToCartII).click();
        return this;
    }

  private final By Successmsg=By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public boolean checksucessmsg(){
        return driver.findElement(this.Successmsg).isDisplayed();
    }


    private final By shoppingcart=By.xpath("//span[@id='cart-total']");

    public P04_Products clickcart(){
        driver.findElement(this.shoppingcart).click();
        return this;
    }



    private final By Checkout=By.xpath("//strong[normalize-space()='Checkout']");

    public P04_Products clickcheckout(){
        driver.findElement(this.Checkout).click();
        return this;
    }
}
