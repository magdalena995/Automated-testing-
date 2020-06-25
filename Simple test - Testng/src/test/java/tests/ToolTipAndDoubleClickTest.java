package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ToolTipPage;

public class ToolTipAndDoubleClickTest extends PropertyFile {
    @Test
    public void toolTipAndDoubleClickTest()  {
        test = report.startTest("Check if user is able to use Tolltip and Doubleclick");


        HomePage homePage = new HomePage();
        ToolTipPage toolTipPage = new ToolTipPage();

        homePage.clickToolTip();
        test.log(LogStatus.INFO, "[Tooltip and Double click] is clicked");

        toolTipPage.doubleClickBtn();
        test.log(LogStatus.INFO, "[Doubleclick] is doubleclicked");

        toolTipPage.compareTextAlertDouble();
        test.log(LogStatus.INFO, "[Alert text] is verified");

        toolTipPage.closeAlertBox();
        test.log(LogStatus.INFO, "[Alert] is closed");

        toolTipPage.rightClickBtn();
        test.log(LogStatus.INFO, "[Right click] is clicked");

        toolTipPage.selectConMenuItem();
        test.log(LogStatus.INFO, "[Copy me] is selected");

        toolTipPage.compareTextAlertRight();
        test.log(LogStatus.INFO, "[Alert text] is verified");

        toolTipPage.closeAlertBox();
        test.log(LogStatus.INFO, "[Alert] is closed");

        toolTipPage.hoverText();
        test.log(LogStatus.INFO, "[Age text] is hovered");

        toolTipPage.verifyHiddenMessage();
        test.log(LogStatus.PASS, "[Hidden message] is verified");




    }
}

