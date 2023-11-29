package PageObject;

import Hooks.BaseTest;
import Util.BrowserManager;
import org.openqa.selenium.By;

public class DashboardPage extends BaseTest {
    private static final By alert=By.xpath("//div[contains(@class, 'alert alert-success')]");
    private static final By listOfJobs=By.xpath("//table/tbody/tr");


public static String getPageTitle(){
        return BrowserManager.getDriver().getTitle();
    }

    public static String registerSuccessAlert(){
        return BrowserManager.getDriver().findElement(alert).getText();
    }


    public static int numberOfListedJob(){
     return  BrowserManager.getDriver().findElements(listOfJobs).size();

    }








            }






