package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class HomePagePolovniAutomobili extends PropertyFile {

    public By btnNewAd = By.xpath("//a[@class='top-menu-submit-classified js_ga-event']");
    public By logIn = By.xpath("//a[@class='uk-float-left js_ga-event']");
    public By selectLogIn = By.xpath("//ul[@class='uk-nav uk-nav-dropdown']//a[@href='/login']");


    public void clickNewAd(){
        MainMethods.clickOnButton(btnNewAd);
    }
    public void clickLogIn(){
        MainMethods.waitElementToBeVisible(logIn);
        MainMethods.getMouseHover(logIn);
        MainMethods.clickOnButton(selectLogIn);
    }
}
