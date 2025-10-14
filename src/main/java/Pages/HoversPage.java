package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figureBox= By.id("figure");

    public HoversPage(WebDriver driver){
        this.driver=driver;
    }
    public void hoverOverFigure(int index){
        WebElement figure=driver.findElement(figureBox);
        Actions action=new Actions(driver);
        actions.moveToElement(By.class())
    }


}
