package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_ConfirmOrder {
    //TODO: 1- Define Webdriver
    WebDriver driver;

    //TODO: 2- Define Constructor and set value of webdriver

    public P09_ConfirmOrder(WebDriver driver) {
        this.driver = driver;
    }

    private final By Confirmorder= By.id("button-confirm");

    public P09_ConfirmOrder clickconfirmorder(){
        driver.findElement(this.Confirmorder).click();
        return this;
    }

    private final By ordersubmitted=By.xpath("//h1[normalize-space()='Your order has been placed!']");

    public boolean checksubmittedmsg(){
        return driver.findElement(this.ordersubmitted).isDisplayed();
    }
}
