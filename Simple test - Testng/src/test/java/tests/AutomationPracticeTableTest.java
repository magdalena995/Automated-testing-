package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.AutomationPracticeTablePage;
import pageObjects.HomePage;

import java.io.IOException;

public class AutomationPracticeTableTest extends PropertyFile {
    @Test
    public void automationPracticeTableTest() throws IOException {
        test = report.startTest("Check if user is able to save table in text document");
        HomePage homePage = new HomePage();
        AutomationPracticeTablePage automationPracticeTablePage = new AutomationPracticeTablePage();

        homePage.clickTable();
        test.log(LogStatus.INFO, "[Automation Practice Table] is clicked");

        automationPracticeTablePage.getHead();
        test.log(LogStatus.INFO, "[Head] is saved");

        automationPracticeTablePage.getBody();
        test.log(LogStatus.INFO, "[Body] is saved");

        automationPracticeTablePage.getFoot();
        test.log(LogStatus.INFO, "[Foot] is saved");

        automationPracticeTablePage.createDoc();
        test.log(LogStatus.PASS, "[Table] is saved into document");
    }
}