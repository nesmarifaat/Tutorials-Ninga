package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.PageBase.shortWait;

public class P08_PaymentMethod {
    //TODO: 1- Define Webdriver
    WebDriver driver;

    //TODO: 2- Define Constructor and set value of webdriver

    public P08_PaymentMethod(WebDriver driver) {
        this.driver = driver;
    }

    private final By Termscomdition=By.xpath("//input[@name='agree']");
    public P08_PaymentMethod agreeterms(){
        driver.findElement(this.Termscomdition).click();
        return this;
    }

    private final By Continue=By.id("button-payment-method");

    public P08_PaymentMethod clickcontinue(){
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.Continue));
            driver.findElement(this.Continue).click();
        }catch (TimeoutException ex){
            ex.printStackTrace();
        }

        return this;
    }
}
