package StepDefination;

import PageObject.HomePage;
import Util.BrowserManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Home {
    private WebDriver driver;


    @Given("Launch the application")
    public void launch_the_application() {
        driver = BrowserManager.getDriver();
        driver.get("file:///C:/Users/ritur/IdeaProjects/Selenium/registration-test/registration-test/index.html");
    }


    @And("quit the application")
    public void quit_the_application() {
        BrowserManager.quitDriver();
    }

    @Then("Validate user is on home page")
    public void validate_user_is_on_home_page() {
        Assert.assertEquals(HomePage.titleOfThePage(),"Registration Test");
        Assert.assertEquals(HomePage.validateRegistartionHomePage(),"This is an example registration and dashboard page proof of concept. Good luck!");
        Assert.assertTrue(HomePage.validateRegisterButton());

    }





}
