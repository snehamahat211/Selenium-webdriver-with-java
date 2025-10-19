package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wysiwyg {
    private WebDriver driver;
    private String editorframeId="mce_0_ifr";
    private By textArea= By.id("tinymce");
    private By decreaseIndentButton=By.cssSelector("#content > div > div > div.tox-editor-container > div.tox-editor-header > div.tox-toolbar-overlord.tox-tbtn--disabled > div > div:nth-child(5) > button:nth-child(2) > span > svg");

    public Wysiwyg(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public  void  decreaseIndentation(){
        switchToMainArea();
        driver.findElement(decreaseIndentButton).click();

    }
    public String getTextFromEditor(){
        switchToMainArea();
        String text=driver.findElement(textArea).getText();
        switchToMainArea();

        return text;
    }
    private void switchToEditArea(){
        driver.switchTo().frame(editorframeId);
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

}
