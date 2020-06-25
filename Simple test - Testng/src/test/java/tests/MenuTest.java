package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.MenuPage;

public class MenuTest extends PropertyFile {

        @Test
        public void menuTest() {
            test = report.startTest("Check if user is able to use menu");

            HomePage homePage = new HomePage();
            MenuPage menuPage = new MenuPage();

            homePage.clickMenu();
            test.log(LogStatus.INFO, "[Menu] is clicked");

            menuPage.hoverBooks();
            test.log(LogStatus.INFO, "[Books] is hovered");

            menuPage.hoverClothing();
            test.log(LogStatus.INFO, "[Clothing] is hovered");

            menuPage.hoverElectronics();
            test.log(LogStatus.INFO, "[Electronics] is hovered and [Car Hifi] is clicked");

            menuPage.hoverMusic();
            test.log(LogStatus.PASS, "[Music] is hovered and [Rock] and [Alternative] are clicked");





        }
    }