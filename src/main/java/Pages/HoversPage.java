package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    private WebDriver driver;
    private By figureBox= By.id("figure");
    private By boxCaption =By.id("boxCaption");

    public HoversPage(WebDriver driver){
        this.driver=driver;
    }
    public void hoverOverFigure(int index)
    {
        List<WebElement> figures=driver.findElements(figureBox);
        WebElement figure=figures.get(index-1);
        Actions actions=new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }
    public class FigureCaption(WebElement caption){
        private WebElement caption;
        private By header=By.tagName("h5");
        private By link=By.tagName("a");
        public FigureCaption(WebElement caption){
            this.caption=caption;
        }
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }
        public String getTitle(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public class FigureCaption(...)
    }


}
