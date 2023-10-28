package Test;

import Hooks.BaseTest;

import Input.ExcelReader;
import PageObject.ChallangingDOM;
import PageObject.DynamicLoading;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyTestNGTest extends BaseTest {

    @Test
    public void validatingTheIDs_AreDifferentAfterClickingRedButton() {
        ChallangingDOM challangingDOM = new ChallangingDOM(driver);
        challangingDOM.navigateTo("https://the-internet.herokuapp.com/");
        challangingDOM.clickChallangingDOM();
        Assert.assertFalse(challangingDOM.validatingIdsShouldNotBeSameAfterClickingRedBtn(), "Ids are same after clicking on red button");

    }

    @Test
    public void validateHelloWorld() {
        DynamicLoading dynamicLoading = new DynamicLoading(driver);
        dynamicLoading.navigateTo("https://the-internet.herokuapp.com/");
        dynamicLoading.clickDynamicLoading();
        dynamicLoading.clickExample2();
        dynamicLoading.clickStartButton();
        Assert.assertEquals(dynamicLoading.validateHelloButton(),"Hello World!");

    }
}



