package testcases;

import io.qameta.allure.*;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_Login;
import pages.P03_Profile;
import utilities.Utility;

import java.io.IOException;

@Feature("Login Feature")
@Epic("Login Epic")
public class TC01_Login extends TestBase {
    //TODO: define test data
    String email= Utility.getSingleJsonData(System.getProperty("user.dir")+"/src/test/resources/data_driven/logindata.json","email");
    String password=Utility.getSingleJsonData(System.getProperty("user.dir")+"/src/test/resources/data_driven/logindata.json","password");

    public TC01_Login() throws IOException, ParseException {
    }

    @Description("Check Login With Valid Data")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(priority = 1,description = "Check Login With Valid Data",retryAnalyzer = retrytest.Retry.class)
    public void checkLogin_P(){
       new P01_HomePage(driver).clickMyAccount().clickLogin();
       new P02_Login(driver).fillEmail(email).fillPassword(password).clickLogin();
       // take screenshot
        Utility.captureScreenshot(driver,"P_Login");
        // assert if login successfully
       Assert.assertTrue(new P02_Login(driver).checkLogin());
   }

    @Description("Check Login With Invalid Email")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(priority = 2,description = "Check Login With Invalid Email")
    public void checkLoginWithInvalidEmail_N(){
        email="test@test.com";
        new P01_HomePage(driver).clickMyAccount().clickLogin();
        new P02_Login(driver).fillEmail(email).fillPassword(password).clickLogin();
    }

    @Description("Check Login With Invalid Password")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(priority = 3,description = "Check Login With Invalid Password")
    public void checkLoginWithInvalidPassword_N(){
        password="test";
        new P01_HomePage(driver).clickMyAccount().clickLogin();
        new P02_Login(driver).fillEmail(email).fillPassword(password).clickLogin();
    }
    @Description("Check Login With Invalid Data")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(priority = 4,description = "Check Login With Valid Data")
    public void checkLoginWithInvalidData_N(){
        email="test@test.com";
        password="test";
        new P01_HomePage(driver).clickMyAccount().clickLogin();
        new P02_Login(driver).fillEmail(email).fillPassword(password).clickLogin();
    }
}
