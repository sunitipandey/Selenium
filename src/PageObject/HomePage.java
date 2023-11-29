package PageObject;

import Hooks.BaseTest;
import Util.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BaseTest {
    private static final By dynamicLoadingLink=By.xpath("//a[contains(@href,'dynamic_loading')]");
    private static final By registrationLabel=By.xpath("//div[contains(@class, 'jumbotron')]/p[1]");

    private static final By registerButton=By.xpath("//a[contains(@href,'register.html')]");

    static WebDriverWait wait = new WebDriverWait(BrowserManager.getDriver(), Duration.ofSeconds(100));



    public void clickDynamicLoading(){
    driver.findElement(dynamicLoadingLink).click();

    }






    public static String validateRegistartionHomePage(){
      return wait.until(ExpectedConditions.elementToBeClickable(registrationLabel)).getText();

    }

    public static boolean validateRegisterButton(){
        return wait.until(ExpectedConditions.elementToBeClickable(registerButton)).isDisplayed();
    }

    public static String titleOfThePage() {
      return BrowserManager.getDriver().getTitle();
    }

}
