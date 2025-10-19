package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AlertsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By triggerAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By results = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void triggerAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(triggerAlertButton)).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getResult() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(results)).getText();
    }
}
