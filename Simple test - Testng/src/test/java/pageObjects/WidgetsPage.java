package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class WidgetsPage extends PropertyFile {

    public By btnToolTip = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/tooltip/']");
    public By btnTabs = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/tabs/']");
    public By btnSpinner = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/spinner/']");
    public By btnSwitchWin = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/automation-practice-switch-windows-2/']");
    public By btnSlider = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/slider/']");
    public By btnProgress = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/progressbar/']");
    public By btnDialog = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/dialog/']");
    public By btnDatePicker = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/datepicker/']");


    public void clickToolTip(){
        MainMethods.clickOnButton(btnToolTip);
    }
    public void clickTabs(){
        MainMethods.clickOnButton(btnTabs);
    }
    public void clickSpinner(){
        MainMethods.clickOnButton(btnSpinner);
    }
    public void clickSwitchWin(){
        MainMethods.clickOnButton(btnSwitchWin);
    }
    public void clickSlider(){
        MainMethods.clickOnButton(btnSlider);
    }
    public void clickProgress(){
        MainMethods.clickOnButton(btnProgress);
    }
    public void clickDialog(){
        MainMethods.clickOnButton(btnDialog);
    }
    public void clickDatePicker(){
        MainMethods.clickOnButton(btnDatePicker);
    }

}
