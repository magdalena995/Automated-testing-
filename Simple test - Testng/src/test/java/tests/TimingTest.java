package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.TimingAlertPage;
import pageObjects.WidgetsPage;

public class TimingTest extends PropertyFile {
    @Test
    public void timingTest() {
        test = report.startTest("Check if user is able to use Timing Alert");

        HomePage homePage = new HomePage();
        WidgetsPage widgetsPage = new WidgetsPage();
        TimingAlertPage timingAlertPage = new TimingAlertPage();

        homePage.clickWidgets();
        test.log(LogStatus.INFO, "[Widgets] is clicked");

        widgetsPage.clickSwitchWin();
        test.log(LogStatus.INFO, "[Automation Practice Switch Windows] is clicked");

        timingAlertPage.clickTimingAlert();
        test.log(LogStatus.INFO, "[Timing Alert] is clicked");

        timingAlertPage.verifyTimingAlert();
        test.log(LogStatus.INFO, "[Alert text] is verified");

        timingAlertPage.closeTimingAlert();
        test.log(LogStatus.INFO, "[Alert] is closed");

        timingAlertPage.verifyColorButton();
        test.log(LogStatus.INFO, "[Red] is verified");

        timingAlertPage.doubleClickBtn();
        test.log(LogStatus.INFO, "[Double click] is doubleclicked");

        timingAlertPage.verifyColorDoubleClick();
        test.log(LogStatus.INFO, "[Orange] is verified");

        timingAlertPage.verifyButtonDisabledText();
        test.log(LogStatus.INFO, "[Enabled] is verified");

        timingAlertPage.verifyBtnVisible();
        test.log(LogStatus.PASS, "[Visible] is verified");



    }

}
