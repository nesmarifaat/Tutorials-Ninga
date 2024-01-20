package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.PageBase.shortWait;

public class P07_DeliveryMethod {
    //TODO: 1- Define Webdriver
    WebDriver driver;

    //TODO: 2- Define Constructor and set value of webdriver

    public P07_DeliveryMethod(WebDriver driver) {
        this.driver = driver;
    }

    private final By Comment=By.xpath("//textarea[@name='comment']");

    public P07_DeliveryMethod filldeliverycomment(String Comment){
        driver.findElement(this.Comment).sendKeys(Comment);
        return this;
    }

    private final By Continue=By.id("button-shipping-method");

    public P07_DeliveryMethod clickcontinue(){
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.Continue));
            driver.findElement(this.Continue).click();
        }catch (TimeoutException ex){
            ex.printStackTrace();
        }

        return this;
    }
}
