package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.PageBase.shortWait;

public class P06_DeleiveryDetails {
    //TODO: 1- Define Webdriver
    WebDriver driver;

    //TODO: 2- Define Constructor and set value of webdriver

    public P06_DeleiveryDetails(WebDriver driver) {
        this.driver = driver;
    }

    private final By ContinueButton=By.id("button-shipping-address");

    public P06_DeleiveryDetails clickcontinue(){
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.ContinueButton));
            driver.findElement(this.ContinueButton).click();
        }catch (TimeoutException ex){
            ex.printStackTrace();
        }

        return this;
    }
}
