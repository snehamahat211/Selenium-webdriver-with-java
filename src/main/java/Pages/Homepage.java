package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}

