package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.HTMLContactFormPage;
import pageObjects.HomePage;


public class HTMLContactFormTest extends PropertyFile {
    @Test
    public void hTMLContactFormTest() {
        test = report.startTest("Check if user is able to use HTML contact form");


        HomePage homePage = new HomePage();
        HTMLContactFormPage htmlContactFormPage = new HTMLContactFormPage();

        homePage.clickHtml();
        test.log(LogStatus.INFO, "[HTML contact form] is clicked");

        htmlContactFormPage.enterFirstName();
        test.log(LogStatus.INFO, "[Magdalena] is typed");

        htmlContactFormPage.enterLastName();
        test.log(LogStatus.INFO, "[Stojanovic] is typed");

        htmlContactFormPage.enterCountry();
        test.log(LogStatus.INFO, "[Srbija] is typed");

        htmlContactFormPage.enterSubject();
        test.log(LogStatus.INFO, "[VTS Kragujevac] is typed");

        htmlContactFormPage.clickSubmit();
        test.log(LogStatus.INFO, "[Submit] is clicked");

        htmlContactFormPage.verifyTextOops();
        test.log(LogStatus.PASS, "[Heading text] is verified");


    }
}