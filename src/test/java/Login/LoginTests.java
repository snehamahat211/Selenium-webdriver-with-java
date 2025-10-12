package Login;

import Base.BaseTests;
import Pages.*;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testsuccessfullogin(){
       LoginPage loginPage=homePage.clickFormAuthentication();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        assertTrue(
                secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect!"
        );


    }
}
