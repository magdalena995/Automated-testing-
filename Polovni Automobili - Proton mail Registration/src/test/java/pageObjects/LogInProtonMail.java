package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class LogInProtonMail extends PropertyFile {

    public static String USER_NAME = "magica995";
    public static String PASSWORD = "Petra2016";

    public By tfUserName = By.xpath("//input[@id='username']");
    public By tfPass = By.xpath("//input[@id='password']");
    public By btnLogIn = By.xpath("//button[@id='login_btn']");

    public void enterUserName(){
        MainMethods.type(tfUserName, USER_NAME);
    }
    public void enterPass(){
        MainMethods.type(tfPass, PASSWORD);
    }
    public void clikLogIn(){
        MainMethods.clickOnButton(btnLogIn);
    }

}