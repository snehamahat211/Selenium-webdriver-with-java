package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTests {
    private WebDriver driver;
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
    public static void main(String[] args) {
        BaseTests tests = new BaseTests();
        tests.setup();
    }


}
