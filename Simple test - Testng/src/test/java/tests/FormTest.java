package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.FormPage;
import pageObjects.HomePage;

public class FormTest extends PropertyFile {
    @Test
    public void formTest() {
        test = report.startTest("Check if user is able to use Automation practice form");

        HomePage homePage = new HomePage();
        FormPage formPage = new FormPage();

        homePage.clickForms();
        test.log(LogStatus.INFO, "[Automation practice form] is clicked");

        formPage.enterFirstName("Magdalena");
        test.log(LogStatus.INFO, "[Magdalena] is typed");

        formPage.enterLastName("Stojanovic");
        test.log(LogStatus.INFO, "[Stojanovic] is typed");

        formPage.selectGender();
        test.log(LogStatus.INFO, "[Gender] is selected");

        formPage.selectYearsOfExperience();
        test.log(LogStatus.INFO, "[Years of experience] is selected");

        formPage.enterDateOfBirth("17.06.1995.");
        test.log(LogStatus.INFO, "[17.06.1995.] is typed");

        formPage.enterProfession();
        test.log(LogStatus.INFO, "[Proffesion] is selected");

        formPage.uploadPhotos();
        test.log(LogStatus.INFO, "[File] is uploaded");

        formPage.selectAutomationTools();
        test.log(LogStatus.INFO, "[Automation toll] is selected");

        formPage.enterContinet();
        test.log(LogStatus.INFO, "[Continents] is clicked");

        formPage.selectContinent();
        test.log(LogStatus.INFO, "[Europe] is selected");

        formPage.enterCommands();
        test.log(LogStatus.PASS, "[Switch Commands] and [Navigation Commands] are selected");

    }
}
