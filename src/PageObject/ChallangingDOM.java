package PageObject;

import Hooks.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class ChallangingDOM extends BaseTest {
private WebDriver driver;
public static final By buttonAlert=By.xpath("//a[contains(@class,'button alert')]");

    private static final By challangingDOMLink=By.xpath("//a[contains(@href,'challenging_dom')]");
    public ChallangingDOM(WebDriver driver) {
        this.driver=driver;
    }

    public void navigateTo(String url){
        driver.get(url);

    }

public void clickChallangingDOM(){
        driver.findElement(challangingDOMLink).click();

    }




    public void clickRedButton(){
        driver.findElement(buttonAlert).click();
    }


public boolean validatingIdsShouldNotBeSameAfterClickingRedBtn(){
    List<String> beforeClickList = new ArrayList<>();
    for (int i = 1; i <= 3; i++) {
        String element = driver.findElement(By.xpath("//div[contains(@class, 'large-2 columns')]/a[" + i + "]")).getAttribute("id");
        beforeClickList.add(element);
    }

    clickRedButton();
    List<String> afterClickList = new ArrayList<>();
    for(int i=1;i<=3;i++){
        String element= driver.findElement(By.xpath("//div[contains(@class, 'large-2 columns')]/a["+i+"]")).getAttribute("id");
        afterClickList.add(element);
    }

   return beforeClickList.equals(afterClickList);

    }


            }






