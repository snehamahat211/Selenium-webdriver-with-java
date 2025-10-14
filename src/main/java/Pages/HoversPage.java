package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class HoversPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    // ✅ Must NOT be static, because it uses instance variables
    public FigureCaption hoverOverFigure(int index) {
        List<WebElement> figures = driver.findElements(figureBox);
        WebElement figure = figures.get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        WebElement caption = figure.findElement(boxCaption);
        return new FigureCaption(caption);
    }

    // ✅ Inner class for handling caption info
    public class FigureCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getTitle() {
            return caption.findElement(header).getText();
        }

        public String getLinkText() {
            return caption.findElement(link).getText();
        }

        public String getLink() {
            return caption.findElement(link).getAttribute("href");
        }
    }
}
