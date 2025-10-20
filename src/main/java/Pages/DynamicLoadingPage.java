package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage{
    private WebDriver driver;
    private String linkxpath="//*[@id=\"content\"]/div/a[1]";
    private By link_Example1=By.xpath(String.format(linkxpath,"Example1"));
    public DynamicLoadingPage(WebDriver driver){
        this .driver = driver;

    }
    public DynamicLoadingExamplePage clickExample1(){
    driver.findElemennt(link_Example1).click();
    return new DynamicLoadingExamplePage(driver);
    }
}
