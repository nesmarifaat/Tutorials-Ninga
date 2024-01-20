package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_HomePage {

    //TODO: 1- Define Webdriver
    WebDriver driver;

    //TODO: 2- Define Constructor and set value of webdriver

    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //TODO: 3- Define Locators using By

    private final By MyAccount=By.xpath("//span[normalize-space()='My Account']");
    private final By Signup=By.xpath("//a[normalize-space()='Register']");
    private final By Login=By.xpath("//a[normalize-space()='Login']");

    //TODO: 4- define action methods
    public P01_HomePage clickMyAccount(){
        driver.findElement(this.MyAccount).click();
        return this;
    }
    public P01_HomePage clickRegistration(){
        driver.findElement(this.Signup).click();
        return this;
    }
    public P01_HomePage clickLogin(){
        driver.findElement(this.Login).click();
        return this;
    }


}
