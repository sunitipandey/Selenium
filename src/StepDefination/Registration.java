package StepDefination;

import Hooks.BaseTest;
import PageObject.RegistrationPage;
import Util.BrowserManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class Registration extends BaseTest {
    protected WebDriver driver;

    RegistrationPage registrationPage=new RegistrationPage(BrowserManager.getDriver());

    @And("Click on registration button")
    public void click_on_registration_button() {
        registrationPage.clickRegister();
    }

    @And("Fill the mandatory field for registration")
    public void fill_mandatory_field() {
        registrationPage.sendEmail();
        registrationPage.sendInterest();
        registrationPage.sendPassword();
        registrationPage.sendConfirmPassword();
        registrationPage.clickRegisterButton();
    }

}
