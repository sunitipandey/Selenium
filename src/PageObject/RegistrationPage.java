package PageObject;

import Hooks.BaseTest;
import Util.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static PageObject.HomePage.wait;

public class RegistrationPage extends BaseTest {
private WebDriver driver;

    private static final By registerButton=By.xpath("//a[contains(@href,'register.html')]");
    private static final By emailText=By.xpath("//input[@id='email']");
    private static final By interestText=By.xpath("//textarea[@id='jobInterests']");
    private static final By passwordText=By.xpath( "//input[@id='password']");
    private static final By confirmPasswordText=By.xpath( "//input[@id='confirmPassword']");

    private static final By register=By.xpath( "//button[contains(text(), 'Register')]");
    public RegistrationPage(WebDriver driver) {
        this.driver=driver;
    }



public void clickRegister(){
       BrowserManager.getDriver().findElement(registerButton).click();
    }

    public void sendEmail(){
         wait.until(ExpectedConditions.presenceOfElementLocated(emailText)).sendKeys("test@gmail.com");

    }


    public void sendInterest(){
        BrowserManager.getDriver().switchTo().frame("iframe");
        wait.until(ExpectedConditions.presenceOfElementLocated(interestText)).sendKeys("test");
   BrowserManager.getDriver().switchTo().parentFrame();
    }

    public void sendPassword(){
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordText)).sendKeys("test");
    }

    public void sendConfirmPassword(){
        wait.until(ExpectedConditions.presenceOfElementLocated(confirmPasswordText)).sendKeys("test");
    }


    public void clickRegisterButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(register)).click();

    }








            }






