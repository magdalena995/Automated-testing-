package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.IFramePage;


public class IFrameTest extends PropertyFile {
    @Test
    public void iFrameTest(){
        test = report.startTest("Check if user is able to enter in IFrames");
        HomePage homePage = new HomePage();
        IFramePage iFramePage = new IFramePage();

        homePage.clickIFrame();
        test.log(LogStatus.INFO, "[IFrame practice page] is clicked");

        iFramePage.enterSearchFrame1();
        test.log(LogStatus.INFO, "[Frame1] is switched and [Appium] is typed");

        iFramePage.enterFrame2();
        test.log(LogStatus.PASS, "[Frame2] is switched, [DatePicker] is clicked and [13.04.2020.] is selected");

    }
}