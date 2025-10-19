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
    private By triggerConfirmButton=By.xpath("/html/body/div[2]/div/div/ul/li[2]/button");
    private By triggertextButton=By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By results = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void triggerAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(triggerAlertButton)).click();
    }

    public void triggerConfirm() {
        wait.until(ExpectedConditions.elementToBeClickable(triggerConfirmButton)).click();
    }

    public void triggertext() {
        wait.until(ExpectedConditions.elementToBeClickable(triggertextButton)).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    public String setInput(String text) {
        driver.switchTo().alert().sendKeys(text);
        return text;
    }
    public String getResult() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(results)).getText();
    }

}
