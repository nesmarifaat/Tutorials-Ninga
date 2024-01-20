package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.Utility;

import java.io.IOException;

public class TC02_E2E_Purchase_Product extends TestBase {
    String email = Utility.getSingleJsonData(System.getProperty("user.dir") + "/src/test/resources/data_driven/logindata.json", "email");
    String password = Utility.getSingleJsonData(System.getProperty("user.dir") + "/src/test/resources/data_driven/logindata.json", "password");
    String DeliveryComment = Utility.getSingleJsonData(System.getProperty("user.dir") + "/src/test/resources/data_driven/logindata.json", "deliverycomment");
    String Firstname = faker.name().firstName();
    String Lastname = faker.name().lastName();
    String Address1 = faker.address().fullAddress();
    String City = faker.address().city();
    String PostCode = faker.address().zipCode();

    public TC02_E2E_Purchase_Product() throws IOException, ParseException {
    }

    @Description("E2E scnario for purchase product")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Purchase")
    @Test(priority = 1, description = "E2E Purchase Flow")
    public void e2eFlow_P()  {
        new P01_HomePage(driver).clickMyAccount().clickLogin();
        new P02_Login(driver).fillEmail(email).fillPassword(password).clickLogin();
        new P03_Profile(driver).movetolaptops().clickalllaptops();
        // take screenshot
        Utility.captureScreenshot(driver, "E2E");
        new P04_Products(driver).clickaddtocart().clickaddtocartII().clickcart();
        Assert.assertTrue(new P04_Products(driver).checksucessmsg());
        new P04_Products(driver).clickcheckout();
        new P04_Products(driver).clickcart();
        new P05_BillingDetails(driver).fillfirstname(Firstname).filllastname(Lastname).filladress1(Address1).fillcity(City).fillpostcode(PostCode).selectcountry().selectregoin().clickcontinue();
        new P05_BillingDetails(driver).clickcontinue();
        new P06_DeleiveryDetails(driver).clickcontinue();
        new P07_DeliveryMethod(driver).filldeliverycomment(DeliveryComment).clickcontinue();
        new P08_PaymentMethod(driver).agreeterms().clickcontinue();
        new P09_ConfirmOrder(driver).clickconfirmorder();
        Assert.assertTrue(new P09_ConfirmOrder(driver).checksubmittedmsg());

    }
}
