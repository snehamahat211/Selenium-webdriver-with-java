package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wysiwyg {
    private WebDriver driver;
    private String editorframeId="mce_0_ifr";
    private By textArea= By.id("tinymce");
    public Wysiwyg(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
    }
    private void switchToEditArea(){
        driver.switchTo().frame(editorframeId);
    }

}
