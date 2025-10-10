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
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        WebElement inputsLink=driver.findElement(By.linkText("Sign in"));
        inputsLink.click();
//        List<WebElement> links=driver.findElements(By.tagName("style"));
//        System.out.println(links.size());
        System.out.println(driver.getTitle());
    }
    public static void main(String[] args) {
        BaseTests tests = new BaseTests();
        tests.setup();
    }


}
