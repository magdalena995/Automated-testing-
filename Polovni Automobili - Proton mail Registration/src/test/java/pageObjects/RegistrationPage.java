package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import methods.SetUp;
import org.openqa.selenium.By;



public class RegistrationPage extends PropertyFile {
    public static String pass = "Abcd1234";
    public static String newEmail = MainMethods.createEmail();



    public By tfEmail = By.xpath("//input[@id='email']");
    public By tfPassFirst = By.xpath("//input[@id='password_first']");
    public By tfPassSec = By.xpath("//input[@id='password_second']");
    public By chbAccept = By.xpath("//input[@id='tos']");
    public By chbAgreeSale = By.xpath("//input[@id='easySaleConsent']");
    public By chbAgreeBuy = By.xpath("//input[@id='easyBuyConsent']");
    public By verEmail = By.xpath("//label[@class='required activetabVerify']");
    public By btnRegister = By.xpath("//button[@name='login']");

    public void enterEmail(){

    MainMethods.clickOnButton(tfEmail);
   // MainMethods.type(tfEmail,s);
    MainMethods.waitForElement(SetUp.createDriver(), tfEmail).sendKeys(newEmail);

    }

    public void enterPassFirst(){
        MainMethods.type(tfPassFirst,pass);
    }
    public void enterPassSec(){
        MainMethods.type(tfPassSec,pass);
    }
    public void checkAccept(){
        MainMethods.clickOnButton(chbAccept);
    }
    public void checkAgreeSale(){
        MainMethods.clickOnButton(chbAgreeSale);
    }
    public void checkAgreeBuy(){
        MainMethods.clickOnButton(chbAgreeBuy);
    }
    public void clickVerEmail(){
        if(MainMethods.btnClass(verEmail).equals("required activetabVerify")){
            MainMethods.clickOnButton(btnRegister);
        }
        else{
            MainMethods.clickOnButton(verEmail);
            MainMethods.clickOnButton(btnRegister);
        }

    }

    public String getPass() {
        return pass;
    }

    public String getNewEmail() {
        return newEmail;
    }

}
