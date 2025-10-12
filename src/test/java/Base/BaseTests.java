package Base;
import Pages.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;


public class BaseTests {
    private WebDriver driver;
    protected Homepage homePage;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage=new Homepage(driver);
        driver.manage().window().maximize();

    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
