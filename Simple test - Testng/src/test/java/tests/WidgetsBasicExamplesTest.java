package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.*;

public class WidgetsBasicExamplesTest extends PropertyFile {
    @Test
    public void widgetsBasicExamplesTest() {
        test = report.startTest("Check if user is able to use basic controls");

        HomePage homePage = new HomePage();
        WidgetsPage widgetsPage = new WidgetsPage();
        ToolTipAgePage toolTipAgePage = new ToolTipAgePage();
        TabsPage tabsPage = new TabsPage();
        SpinnerPage spinnerPage = new SpinnerPage();
        SliderPage sliderPage = new SliderPage();
        ProgressbarPage progressbarPage = new ProgressbarPage();
        DialogPage dialogPage = new DialogPage();
        DatePickerPage datePickerPage = new DatePickerPage();

        homePage.clickWidgets();
        test.log(LogStatus.INFO, "[Widgets] is clicked");

        widgetsPage.clickToolTip();
        test.log(LogStatus.INFO, "[Tooltip] is clicked");

        toolTipAgePage.enterAge();
        test.log(LogStatus.INFO, "[24] is typed");

        toolTipAgePage.hoverTextAge();
        test.log(LogStatus.INFO, "[Age field] is hovered");

        toolTipAgePage.verifyToolTip();
        test.log(LogStatus.INFO, "[Tooltip] is verified and navigated to [Widgets]");

        widgetsPage.clickTabs();
        test.log(LogStatus.INFO, "[Tabs] is clicked");

        tabsPage.clickTabNunc();
        test.log(LogStatus.INFO, "[Nunc] is clicked");

        tabsPage.verifyTextNum();
        test.log(LogStatus.INFO, "[Nunc text] is verified");

        tabsPage.clickTabProin();
        test.log(LogStatus.INFO, "[Proin] is clicked");

        tabsPage.verifyTextProin();
        test.log(LogStatus.INFO, "[Proin text] is verified");

        tabsPage.clickTabAenean();
        test.log(LogStatus.INFO, "[Aenean] is clicked");

        tabsPage.verifyTextAenean();
        test.log(LogStatus.INFO, "[Aenean text] is verified and navigated to [Widgets]");

        widgetsPage.clickSpinner();
        test.log(LogStatus.INFO, "[Spinner] is clicked");

        spinnerPage.clickArrowUp();
        test.log(LogStatus.INFO, "[Arrow Up] is clicked");

        spinnerPage.clickArrowDown();
        test.log(LogStatus.INFO, "[Arrow Down] is clicked");

        spinnerPage.clickDisable();
        test.log(LogStatus.INFO, "[Disable] is clicked");

        spinnerPage.verifyDisabled();
        test.log(LogStatus.INFO, "[Text fied] is verified disabled");

        spinnerPage.clickDisable();
        test.log(LogStatus.INFO, "[Disable] is clicked");

        spinnerPage.clickDestroy();
        test.log(LogStatus.INFO, "[Destroy] is clicked");

        spinnerPage.verifyDestroy();
        test.log(LogStatus.INFO, "[Arrow Up] is verified not found");

        spinnerPage.clickDestroy();
        test.log(LogStatus.INFO, "[Destroy] is clicked");

        spinnerPage.clickGetValue();
        test.log(LogStatus.INFO, "[Get value] is clicked");

        spinnerPage.verifyAlertText();
        test.log(LogStatus.INFO, "[3] is verified");

        spinnerPage.closeAlertBox();
        test.log(LogStatus.INFO, "[Alert] is closed");

        spinnerPage.clickSetValue();
        test.log(LogStatus.INFO, "[Set value] is clicked and navigated to [Widgets]");

        widgetsPage.clickSlider();
        test.log(LogStatus.INFO, "[Slider] is clicked");

        sliderPage.moveRight();
        test.log(LogStatus.INFO, "[Slider] is moved using arrow right");

        sliderPage.moveLeft();
        test.log(LogStatus.INFO, "[Slider] is moved using arrow left and navigated to [Widgets]");

        widgetsPage.clickProgress();
        test.log(LogStatus.INFO, "[Progressbar] is clicked");

        progressbarPage.changeProgress();
        test.log(LogStatus.INFO, "[Progress] is changed and navigated to [Widgets]");

        widgetsPage.clickDialog();
        test.log(LogStatus.INFO, "[Dialog] is clicked");

        dialogPage.dragDialog();
        test.log(LogStatus.INFO, "[Dialog] is dragged");

        dialogPage.resizeDialog();
        test.log(LogStatus.INFO, "[Dialog] is resized");

        dialogPage.closeDialog();
        test.log(LogStatus.INFO, "[Dialog] is closed and navigated to [Widgets]");

        widgetsPage.clickDatePicker();
        test.log(LogStatus.INFO, "[Date picker] is clicked");

        datePickerPage.chooseDate();
        test.log(LogStatus.INFO, "[13.04.2020.] is selected");

        datePickerPage.verifyDate();
        test.log(LogStatus.PASS, "[Date] is verified");






    }
}
