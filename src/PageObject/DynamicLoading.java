package PageObject;

import Hooks.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoading extends BaseTest {
    private static final By dynamicLoadingLink=By.xpath("//a[contains(@href,'dynamic_loading')]");
    private static final By startBtn=By.xpath("//div[@id='start']/button");
    private static final By helloWorldLabel=By.xpath("//div[@id='finish']/h4");
    private static final By exmple2Link=By.xpath("//a[contains(text(),'Example 2: Element rendered after the fact')]");
    private WebDriver driver;
    private WebDriverWait wait;

    public DynamicLoading(WebDriver driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    public void navigateTo(String url){
        driver.get(url);

    }


    public void clickDynamicLoading(){
    driver.findElement(dynamicLoadingLink).click();

    }


    public void clickExample2(){
        wait.until(ExpectedConditions.elementToBeClickable((exmple2Link))).click();
    }


    public void clickStartButton(){
        driver.findElement(startBtn).click();
    }

    public String validateHelloButton(){
       return wait.until(ExpectedConditions.elementToBeClickable(helloWorldLabel)).getText();

    }

}
