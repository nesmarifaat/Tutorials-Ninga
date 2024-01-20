package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.PageBase.shortWait;

public class P02_Login {
    //TODO: 1- Define Webdriver
    WebDriver driver;

    //TODO: 2- Define Constructor and set value of webdriver

    public P02_Login(WebDriver driver) {
        this.driver = driver;
    }

    //TODO: 3- Define Locators using By

    private final By email=By.xpath("//input[@id='input-email']");
    private final By password=By.xpath("//input[@id='input-password']");
    private final By loginButton=By.xpath("//input[@value='Login']");
    private final By checkout=By.xpath("//span[normalize-space()='Checkout']");

    //TODO: 4- define action methods
    public P02_Login fillEmail(String email){
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.email));
            driver.findElement(this.email).sendKeys(email);
        }catch (TimeoutException ex){
            ex.printStackTrace();
        }
        return this;
    }
    public P02_Login fillPassword(String password){
        driver.findElement(this.password).sendKeys(password);
        return this;
    }
    public P02_Login clickLogin(){
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.loginButton));
            driver.findElement(this.loginButton).click();
        }catch (TimeoutException ex){
           ex.printStackTrace();
        }
        return this;
    }
    public boolean checkLogin(){
        return driver.findElement(checkout).isDisplayed();
    }
}
