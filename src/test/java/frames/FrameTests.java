package frames;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests  extends BaseTests {
    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();
        String text1 = "hello";
        String text2 = "world";
        editorPage.setTextArea(text1 + text2); // set together
        editorPage.decreaseIndentation();
        assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text from editor is incorrect.");
        }
}
