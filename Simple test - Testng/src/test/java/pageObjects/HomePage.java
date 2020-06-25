package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class HomePage extends PropertyFile {
    public By btnInteractions = By.xpath("//a[@href='https://demoqa.com/category/interactions/']");
    public By btnToolTip = By.xpath("//a[@href='https://demoqa.com/tooltip-and-double-click/']");
    public By btnWidgets = By.xpath("//a[@href='https://demoqa.com/category/widgets/']");
    public By btnTable = By.xpath("//a[@href='https://demoqa.com/automation-practice-table/']");
    public By btnIFrame = By.xpath("//a[@href='https://demoqa.com/iframe-practice-page/']");
    public By btnHTML = By.xpath("//a[@href='https://demoqa.com/html-contact-form/']");
    public By btnEvent = By.xpath("//a[@href='https://demoqa.com/keyboard-events/']");
    public By btnMenu = By.xpath("//a[@href='https://demoqa.com/menu/']");
    public By btnForms = By.xpath("//a[@href='https://demoqa.com/automation-practice-form/']");

    public void clickInteractions(){
        MainMethods.clickOnButton(btnInteractions);
    }
    public void clickToolTip(){
        MainMethods.clickOnButton(btnToolTip);
    }
    public void clickWidgets(){
        MainMethods.clickOnButton(btnWidgets);
    }
    public void clickTable(){
        MainMethods.clickOnButton(btnTable);
    }
    public void clickIFrame(){
        MainMethods.clickOnButton(btnIFrame);
    }
    public void clickHtml(){
        MainMethods.clickOnButton(btnHTML);
    }
    public void clickEvent(){
        MainMethods.clickOnButton(btnEvent);
    }
    public void clickMenu(){
        MainMethods.clickOnButton(btnMenu);
    }
    public void clickForms(){
        MainMethods.clickOnButton(btnForms);
    }

}
