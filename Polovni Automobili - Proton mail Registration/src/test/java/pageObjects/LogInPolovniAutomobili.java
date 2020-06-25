package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class LogInPolovniAutomobili extends PropertyFile {
    RegistrationPage registrationPage = new RegistrationPage();
    public String user = registrationPage.getNewEmail();
    public String password = registrationPage.getPass();

    public By btnRegister = By.xpath("//a[@class='uk-width-1-1 uk-button button-register uk-button-large button-box-shadow-remove uk-text-large']");
    public By tfUser = By.xpath("//input[@id='username_header']");
    public By btnNext = By.xpath("//button[@id='next-step']");
    public By tfPassword = By.xpath("//input[@id='password_header']");
    public By btnLog = By.xpath("//button[@name='login']");
    public By verLogIn = By.xpath("//div[@class='uk-float-left']//span[contains(.,'"+user+"')]");


    public void clickRegister(){
        MainMethods.clickOnButton(btnRegister);
    }

    public void enterLogIn(){
        MainMethods.type(tfUser,user);
        MainMethods.clickOnButton(btnNext);
        MainMethods.type(tfPassword,password);
        MainMethods.clickOnButton(btnLog);
    }
    public void verifyLogIn(){
        MainMethods.waitElementToBeVisible(verLogIn);
        MainMethods.returnWindow();
    }
}

