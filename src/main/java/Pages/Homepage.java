package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;
    private By formAuthentication=By.linkText("Form Authrntication");
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthentication).click();
        return new LoginPage(driver);
    }
}
