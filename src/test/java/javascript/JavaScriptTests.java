package javascript;

import Base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {
    @Test
    public void  testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();



    }



}
