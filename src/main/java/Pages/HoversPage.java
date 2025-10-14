package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    private WebDriver driver;
    private By figureBox= By.id("figure");

    public HoversPage(WebDriver driver){
        this.driver=driver;
    }
    public void hoverOverFigure(int index)
    {
        List<WebElement> figures=driver.findElements(figureBox);
        WebElement figure=figures.get(index-1);
        Actions actions=new Actions(driver);
        actions.moveToElement(figure).perform();
    }


}
