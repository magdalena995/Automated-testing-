package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ToolTipPage extends PropertyFile {
    public static String alertDouble = "Double Click Alert\n" +
            "\n" +
            "Hi,You are seeing this message as you have double cliked on the button";
    public static String alertRigth = "You have selected Copy";

    public By btnDoubleClick = By.xpath("//button[@id='doubleClickBtn']");
    public By btnRightClick = By.xpath("//button[@id='rightClickBtn']");
    public By contextMenuItem = By.xpath("//div[@class='contextMenu']//div[contains(.,'Copy Me')]");
    public By scroll = By.xpath("//a[@href='https://demoqa.com/keyboard-events-sample-form/']");
    public By textHoverMe = By.xpath("//div[@id='tooltipDemo']");
    public By hiddenMessage = By.xpath("//span[contains(.,'We ask for your age only for statistical purposes.')]");

    public void doubleClickBtn(){

        MainMethods.doubleClick(btnDoubleClick);
    }
    public void compareTextAlertDouble(){
        String s = MainMethods.txtAlert();
        Assert.assertTrue(s.equals(alertDouble));
    }
    public void closeAlertBox(){
        MainMethods.closeAlert();
    }
    public void rightClickBtn(){
        MainMethods.rightClick(btnRightClick);
        MainMethods.scrollDown(scroll);
    }
    public void selectConMenuItem(){
        MainMethods.clickOnButton(contextMenuItem);
    }
    public void compareTextAlertRight(){
        String s = MainMethods.txtAlert();
        Assert.assertTrue(s.equals(alertRigth));

    }
    public void hoverText(){
        MainMethods.getMouseHover(textHoverMe);
    }
    public void verifyHiddenMessage(){
        MainMethods.waitElementToBeVisible(hiddenMessage);
    }
}
