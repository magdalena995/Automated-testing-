package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.AutomationPracticeSwitchWindowsPage;
import pageObjects.HomePage;
import pageObjects.WidgetsPage;

public class AutomationPracticeSwitchWindowsTest extends PropertyFile {
    @Test
    public void automationPracticeSwitchWindowsTest() {
        test = report.startTest("Check if user is able to open and close another windows and tabs");
        HomePage homePage = new HomePage();
        WidgetsPage widgetsPage = new WidgetsPage();
        AutomationPracticeSwitchWindowsPage automationPracticeSwitchWindowsPage = new AutomationPracticeSwitchWindowsPage();

        homePage.clickWidgets();
        test.log(LogStatus.INFO, "[Widgets] is clicked");

        widgetsPage.clickSwitchWin();
        test.log(LogStatus.INFO, "[Automation Practice Switch Windows] is clicked");

        automationPracticeSwitchWindowsPage.clickNewWin();
        test.log(LogStatus.INFO, "[New Browser Window] is clicked and closed");

        automationPracticeSwitchWindowsPage.clickNewMsgWin();
        test.log(LogStatus.INFO, "[New Message Window] is clicked and closed");

        automationPracticeSwitchWindowsPage.clickNewTab();
        test.log(LogStatus.INFO, "[New Tab Window] is clicked and closed");

        automationPracticeSwitchWindowsPage.verifyRandomID();
        test.log(LogStatus.INFO, "[Random ID] is verified");

        automationPracticeSwitchWindowsPage.openAlert();
        test.log(LogStatus.INFO, "[Alert] is clicked");

        automationPracticeSwitchWindowsPage.verifyAlertText();
        test.log(LogStatus.INFO, "[Alert Text] is verified");

        automationPracticeSwitchWindowsPage.closeAlert();
        test.log(LogStatus.PASS, "[Alert] is closed");


    }
}