package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;
import org.testng.Assert;


public class AutomationPracticeSwitchWindowsPage extends PropertyFile {

    public By btnNewWin= By.xpath("//button[@id='button1']");
    public By btnNewMsgWin= By.xpath("//button[contains(.,'New Message Window')]");
    public By btnNewTab= By.xpath("//button[contains(.,'New Browser Tab')]");
    public By randomId = By.xpath("//p[contains(.,'I will have random ID')]");
    public By btnAlert = By.xpath("//button[@id='alert']");


    public void clickNewWin(){
        MainMethods.clickOnButton(btnNewWin);
        MainMethods.switchWindow();
        MainMethods.maxWindow();
        MainMethods.returnWindow();
    }
    public void clickNewMsgWin(){
        MainMethods.clickOnButton(btnNewMsgWin);
        MainMethods.switchWindow();
        MainMethods.returnWindow();
    }
    public void clickNewTab() {
        MainMethods.clickOnButton(btnNewTab);
        MainMethods.switchWindow();
        MainMethods.returnWindow();
    }

    public void verifyRandomID()
    {
        MainMethods.waitElementToBeVisible(randomId);
    }

    public void openAlert()
    {
        MainMethods.clickOnButton(btnAlert);
    }


    public void verifyAlertText()
    {
        String s = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
        String t = MainMethods.txtAlert();
        Assert.assertTrue(t.equals(s));

    }
    public void closeAlert()
    {
        MainMethods.closeAlert();
    }

}
