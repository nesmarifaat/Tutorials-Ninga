package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P03_Profile {
    //TODO: 1- Define Webdriver
    WebDriver driver;

    //TODO: 2- Define Constructor and set value of webdriver

    public P03_Profile(WebDriver driver) {
        this.driver = driver;
    }

    //TODO: Check if logout is visible

    private final By Logout= By.xpath("//a[@href=\"https://tutorialsninja.com/demo/index.php?route=account/logout\"]");

    public boolean verifylogoutvisabilty()
    {
        return driver.findElement(this.Logout).isDisplayed();
    }

    //TODO: Move to Laptops Category
private final By Laptops=By.xpath("//a[normalize-space()='Laptops & Notebooks']");

    public P03_Profile movetolaptops(){
        Actions action=new Actions(driver);
        WebElement Laptpos=driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
        action.moveToElement(Laptpos).build().perform();
        return this;
    }

    //**************************************************************************************

    private final By AllLaptops=By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");

    public P03_Profile clickalllaptops(){
        driver.findElement(this.AllLaptops).click();
        return this;
    }

    //TODO: Assert that laptops category is opned

    private final By Laptopscategory=By.xpath("//h2[normalize-space()='Laptops & Notebooks']");

    public boolean verifylaptopsisdisplayed(){
        return driver.findElement(this.Laptopscategory).isDisplayed();

    }
}
