package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class HTMLContactFormPage extends PropertyFile {

    public By tfFName = By.xpath("//input[@class='firstname']");
    public By tfLName = By.xpath("//input[@id='lname']");
    public By tfCountry = By.xpath("//input[@name='country']");
    public By tfSubject = By.xpath("//textarea[@id='subject']");
    public By btnSubmit = By.xpath("//input[@type='submit']");
    public By txtOops = By.xpath("//h1[contains(.,'Oops! That page can’t be found.')]");


    public void enterFirstName(){
        MainMethods.type(tfFName,"Magdalena");
    }
    public void enterLastName(){
        MainMethods.type(tfLName,"Stojanovic");
    }
    public void enterCountry(){
        MainMethods.type(tfCountry,"Srbija");
    }
    public void enterSubject(){
        MainMethods.type(tfSubject,"VTS Kragujevac");
    }
    public void clickSubmit(){
        MainMethods.clickOnButton(btnSubmit);
    }
    public void verifyTextOops(){
        MainMethods.waitElementToBeVisible(txtOops);
    }

}
