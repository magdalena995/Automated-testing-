package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SpinnerPage extends PropertyFile {

    public static String classDisable = "ui-spinner ui-corner-all ui-widget ui-widget-content ui-spinner-disabled ui-state-disabled";
    public By arrowUp = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']");
    public By arrowDown = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']");
    public By btnDisable = By.xpath("//button[@id='disable']");
    public By btnDestroy = By.xpath("//button[@id='destroy']");
    public By btnGetValue = By.xpath("//button[@id='getvalue']");
    public By btnSetValue = By.xpath("//button[@id='setvalue']");
    public By textField = By.xpath("//span[@class='ui-spinner ui-corner-all ui-widget ui-widget-content ui-spinner-disabled ui-state-disabled']");

    public void clickArrowUp(){
        for(int i = 0; i<6; i++){
            MainMethods.clickOnButton(arrowUp);

        }
    }
    public void clickArrowDown(){
        for(int i = 0; i<3; i++){
            MainMethods.clickOnButton(arrowDown);

        }
    }
    public void clickDisable(){
        MainMethods.clickOnButton(btnDisable);

    }
    public void verifyDisabled(){
        String s = MainMethods.btnClass(textField);
        Assert.assertTrue(s.equals(classDisable));
    }
    public void clickDestroy(){
        MainMethods.clickOnButton(btnDestroy);
    }
    public void verifyDestroy(){
        Assert.assertTrue(getDriver().findElements(arrowUp).isEmpty());
    }
    public void clickGetValue(){
        MainMethods.clickOnButton(btnGetValue);
    }
    public void verifyAlertText(){
        String s = "3";
        String t = MainMethods.txtAlert();
        Assert.assertTrue(t.equals(s));
    }
    public void closeAlertBox(){
        MainMethods.closeAlert();
    }
    public void clickSetValue(){
        MainMethods.clickOnButton(btnSetValue);
        getDriver().navigate().to("https://demoqa.com/category/widgets/");
    }

}
