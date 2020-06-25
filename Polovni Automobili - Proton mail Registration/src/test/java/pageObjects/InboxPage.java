package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class InboxPage extends PropertyFile {

    public By lblPolovniAutomobili = By.xpath("//span[contains(.,'PolovniAutomobili')]");
    public By linkAcceptRegistration = By.xpath("//a[contains(.,'https://www.polovniautomobili.com/aktivacija-naloga')]");
    public By btnMoveToTrash = By.xpath("//button[@class='pm_buttons-child fa fa-trash-o toolbar-btn-trash moveElement-btn-trash']");
    public By verEmptyInbox = By.xpath("//h3[contains(.,'No conversations')]");
    public By btnTrash = By.xpath("//span[contains(.,'Trash')]");
    public By lblPolovniAutomobiliTrash = By.xpath("//span//span[contains(.,'PolovniAutomobili')]");
    public By btnDelete = By.xpath("//button[@class='pm_buttons-child fa fa-times-circle-o toolbar-btn-delete moveElement-btn-delete']");
    public By btnConfirm = By.xpath("//button[@id='confirmModalBtn']");

    public void verifyPolovniAutomobili(){
        MainMethods.waitElementToBeVisible(lblPolovniAutomobili);
    }
    public void enterEmail(){
        MainMethods.clickOnButton(lblPolovniAutomobili);
    }
    public void clickAcceptRegstration(){
        MainMethods.scrollDown(linkAcceptRegistration);
        MainMethods.waitElementToBeVisible(linkAcceptRegistration);
        MainMethods.clickOnButton(linkAcceptRegistration);
    }
    public void moveToTrash(){

        MainMethods.clickOnButton(btnMoveToTrash);
    }
    public void verifyEmptyInbox(){
        MainMethods.waitElementToBeVisible(verEmptyInbox);
    }
    public void emptyTrash(){
        MainMethods.clickOnButton(btnTrash);
        MainMethods.waitElementToBeVisible(lblPolovniAutomobiliTrash);
        MainMethods.clickOnButton(btnDelete);
        MainMethods.clickOnButton(btnConfirm);
    }
}
