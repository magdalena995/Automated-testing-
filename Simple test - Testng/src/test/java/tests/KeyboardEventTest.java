package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.KeyboardEventsPage;

public class KeyboardEventTest extends PropertyFile {
    @Test
    public void keyboardEventTest() {
        test = report.startTest("Check if user is able to upload file");

        HomePage homePage = new HomePage();
        KeyboardEventsPage keyboardEventsPage = new KeyboardEventsPage();

        homePage.clickEvent();
        test.log(LogStatus.INFO, "[Keyboard Events] is clicked");

        keyboardEventsPage.uploadTxt();
        test.log(LogStatus.INFO, "[Txt file] is uploaded");

        keyboardEventsPage.clickUpload();
        test.log(LogStatus.INFO, "[Upload] is clicked");

        keyboardEventsPage.verifyAlertText();
        test.log(LogStatus.INFO, "[Alert text] is verified");

        keyboardEventsPage.closeAlertBox();
        test.log(LogStatus.PASS, "[Alert] is closed");
    }
}