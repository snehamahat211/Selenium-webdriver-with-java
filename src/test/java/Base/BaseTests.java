package Base;

import Pages.Homepage;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private WebDriver driver;
    protected Homepage homePage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new Homepage(driver);
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterMethod
    public void takeScreenshot() {
        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        try {
            // Create the directory if it doesn't exist
            File screenshotDir = new File("resources/screenshots");
            if (!screenshotDir.exists()) {
                screenshotDir.mkdirs();
            }

            // Save screenshot with a timestamp
            String filePath = "resources/screenshots/test_" + System.currentTimeMillis() + ".png";
            Files.copy(screenshot, new File(filePath));
            System.out.println("Screenshot saved: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }
}
