package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.PageBase.shortWait;

public class P05_BillingDetails {
    //TODO: 1- Define Webdriver
    WebDriver driver;

    //TODO: 2- Define Constructor and set value of webdriver

    public P05_BillingDetails(WebDriver driver) {
        this.driver = driver;
    }

    //**********************************************************************************
    private final By Firstname = By.id("input-payment-firstname");

    public P05_BillingDetails fillfirstname(String Firstname) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.Firstname));
            driver.findElement(this.Firstname).sendKeys(Firstname);
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }

        return this;
    }

    //**********************************************************************************
    private final By Lastname = By.id("input-payment-lastname");

    public P05_BillingDetails filllastname(String Lastname) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.Lastname));
            driver.findElement(this.Firstname).sendKeys(Lastname);
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }

        return this;
    }

    //**********************************************************************************
    private final By Address1 = By.id("input-payment-address-1");

    public P05_BillingDetails filladress1(String Address1) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.Address1));
            driver.findElement(this.Firstname).sendKeys(Address1);
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }

        return this;
    }

    //**********************************************************************************
    private final By City = By.id("input-payment-city");

    public P05_BillingDetails fillcity(String City) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.City));
            driver.findElement(this.ContinueButton).click();
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        return this;
    }

    //**********************************************************************************
    private final By Postcode = By.id("input-payment-postcode");

    public P05_BillingDetails fillpostcode(String Postcode) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.Postcode));
            driver.findElement(this.Postcode).sendKeys(Postcode);
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }

        return this;
    }


    //**********************************************************************************
    private final By Country = By.id("input-payment-country");

    public P05_BillingDetails selectcountry() {

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.Country));
        driver.findElement(this.Country).click();
        driver.findElement(this.Country).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(this.Country).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(this.Country).sendKeys(Keys.ENTER);


        return this;
    }

    //**********************************************************************************
    private final By Regoin = By.id("input-payment-zone");

    public P05_BillingDetails selectregoin() {

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.Regoin));
        driver.findElement(this.Regoin).click();
        driver.findElement(this.Regoin).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(this.Regoin).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(this.Regoin).sendKeys(Keys.ENTER);

        driver.findElement(this.ContinueButton).click();


        return this;
    }

    //**********************************************************************************
    private final By ContinueButton = By.id("button-payment-address");

    public P05_BillingDetails clickcontinue() {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.ContinueButton));
            driver.findElement(this.ContinueButton).click();
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }


        return this;
    }
}
