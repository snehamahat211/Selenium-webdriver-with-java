package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class BaseTests {
    private WebDriver driver;
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
    public static void main(String[] args) {
        BaseTests tests = new BaseTests();
        tests.setup();
    }


}
