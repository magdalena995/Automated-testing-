package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class RegistrationSuccess extends PropertyFile {
    public By lblThankYou = By.xpath("//p[contains(.,'Hvala na registraciji!')]");

    public void verifyThankYou(){
        MainMethods.waitElementToBeVisible(lblThankYou);
    }
    public void changeUrl(){
        getDriver().navigate().to("https://protonmail.com/");
    }
}
