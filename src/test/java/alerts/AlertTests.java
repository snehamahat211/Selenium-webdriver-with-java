package alerts;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
            public void testAcceptAlert() {
        var alertsPage=homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert","Result Text incorrect ");

    }
    @Test
    public void testRejectAlert() {
        var alertsPage=homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        alertsPage.dismissAlert();
        String text= alertsPage.getAlertText();
        assertEquals(text,"I am a JS Confirm","Alert Text incorrect ");

    }
    @Test
    public void testtextAlert() {
        var alertsPage=homePage.clickJavaScriptAlerts();
        alertsPage.triggertext();
        String text= "This is the alert text";
        alertsPage.setInput(text);
        assertEquals(alertsPage.getResult(),"You entered:"+ text,"Result Text incorrect");}}

