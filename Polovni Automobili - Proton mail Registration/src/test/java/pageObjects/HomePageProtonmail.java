package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class HomePageProtonmail extends PropertyFile {

    public By btnLogIn = By.xpath("//a[@class='btn btn-ghost btn-short']");

    public void clickLogIn(){
        MainMethods.clickOnButton(btnLogIn);
    }
}
