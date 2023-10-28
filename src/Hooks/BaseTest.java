package Hooks;

import Util.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected WaitUtils waitUtils;
    @BeforeClass
    public void setUp() {
        // Set the path to the ChromeDriver executable (replace with your driver path)
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Configure Chrome options (e.g., headless mode)
        ChromeOptions chromeOptions = new ChromeOptions();
       // chromeOptions.addArguments("--headless"); // Uncomment this line for headless mode

        // Initialize the WebDriver with Chrome and the configured options
        driver = new ChromeDriver(chromeOptions);

        // Maximize the browser window
        driver.manage().window().maximize();
        waitUtils = new WaitUtils(driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
