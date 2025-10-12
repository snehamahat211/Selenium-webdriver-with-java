package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SecureAreaPage {
    private WebDriver driver;
    private By statusALert=By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText(){
        return driver.findElement(statusALert).getText();}


}
