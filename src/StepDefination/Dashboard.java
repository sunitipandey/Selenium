package StepDefination;

import PageObject.DashboardPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class Dashboard {
    @And("Validate registration is completed successfully")
    public void click_on_registration_button() {
        Assert.assertTrue(DashboardPage.getPageTitle().equalsIgnoreCase("Dasboard"));
        Assert.assertTrue(DashboardPage.registerSuccessAlert().equalsIgnoreCase("Your registration has been successful!"));
        Assert.assertEquals(DashboardPage.numberOfListedJob(),5,"Number of listed jobs are not 5");
    }



}
