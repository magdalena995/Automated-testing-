package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TimingAlertPage extends PropertyFile {
    public By btnTimingAlert = By.xpath("//button[@id='timingAlert']");
    public By btnChangeColorRed = By.xpath("//button[@id='colorVar']");
    public By btnDoubleClick = By.xpath("//button[@id='doubleClick']");
    public By btnDisabled = By.xpath("//button[@id='disabledElement']");
    public By btnVisible = By.xpath("//button[@id='invisibility']");


    public void clickTimingAlert()
    {

        MainMethods.clickOnButton(btnTimingAlert);
    }
    public void verifyTimingAlert()
    {

        new WebDriverWait(getDriver(), 20)
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());
        String s = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
        String t = MainMethods.txtAlert();
        Assert.assertTrue(t.equals(s));


    }

    public void closeTimingAlert() {

        MainMethods.closeAlert();
    }

    public void verifyColorButton(){
        MainMethods.scrollDown(btnChangeColorRed);
        new WebDriverWait(getDriver(), 20)
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.attributeContains(btnChangeColorRed,"style","red"));
        String s = MainMethods.btnColor(btnChangeColorRed);

        Assert.assertTrue(s.contains("red"));

    }

    public void doubleClickBtn()
    {
        MainMethods.doubleClick(btnDoubleClick);
    }
    public void verifyColorDoubleClick() {
        new WebDriverWait(getDriver(), 20)
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.attributeContains(btnDoubleClick,"style","orange"));

        String s = MainMethods.btnColor(btnDoubleClick);
        Assert.assertTrue(s.contains("orange"));

    }
    public void verifyButtonDisabledText()
    {
        new WebDriverWait(getDriver(), 20)
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.textToBe(btnDisabled,"enabled"));

        String s = MainMethods.getElementText(btnDisabled);

        Assert.assertTrue(s.contains("enabled"));

    }

    public void verifyBtnVisible()
    {
        MainMethods.waitElementToBeVisible(btnVisible);
    }
}
