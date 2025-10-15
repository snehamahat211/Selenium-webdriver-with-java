package keys;


import Base.BaseTests;
import org.testng.annotations.Test;

public class KeysTests extends BaseTests {
    @Test
    public void testBackspace(){
        var keyPage=homePage.clickKeyPresses();
        keyPage.enterText("A"+Keys.BACK_SPACE);


    }

}
