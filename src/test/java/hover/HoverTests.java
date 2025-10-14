import Base.BaseTests;
import Pages.HoversPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        // Navigate to Hover page
        HoversPage hoverPage = homePage.clickHovers();

        // ✅ Call the instance method on hoverPage (not on class name)
        HoversPage.FigureCaption caption = hoverPage.hoverOverFigure(1);

        // ✅ Verify caption visibility and details
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect: %s");
    }
}
