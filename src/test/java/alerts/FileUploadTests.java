package alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage =homePage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/user/Pictures/Screenshots/Hristpaint.png");
        assertEquals(uploadPage.getUploadedFiles(),"Hristpaint.png","Uplooaded");




    }

}
