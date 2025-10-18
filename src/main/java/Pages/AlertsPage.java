package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton=By.xpath(".//button[text()='Click for JS Alerts'");
    public AlertsPage(WebDriver driver){
        this.driver=driver;

    }
    public void triggerAlerts(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlerts(){
    driver.switchTo().alert().accept();
    }
}
