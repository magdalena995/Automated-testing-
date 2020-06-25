package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class ProfilePage extends PropertyFile {

    public By btnDoYouHaveCar = By.xpath("//div[@class='uk-modal-dialog']//div[@class='uk-width-1-1 uk-text-center']//a[contains(.,'Ne želim')]");
    public By tfFirstName = By.xpath("//input[@id='first_name']");
    public By tfLastName = By.xpath("//input[@id='last_name']");
    public By tfAddress = By.xpath("//input[@id='address']");
    public By tfCity = By.xpath("//input[@id='city']");
    public By selectCity = By.xpath("//a[contains(.,'Kragujevac')]");
    public By tfZip = By.xpath("//input[@id='zip_code']");
    public By cbRegion = By.xpath("//select[@id='region']");
    public By clickSumadijski = By.xpath("//select[@id='region']//option(@value='Šumadijski')");
    public By cbCountry = By.xpath("//select[@id='country']");
    public By clickSerbia = By.xpath("//select[@id='region']//option(@value='RS')");
    public By tfPhoneNum = By.xpath("//input[@id='cellphone']");
    public By btnSave = By.xpath("//button[@id='submit']");
    public By verSuccess = By.xpath("//div[contains(text(),'Uspešno si izmenio tvoje podatke')]");
    public By myProfile = By.xpath("//div[@class='uk-float-left']");
    public By selectLogOut = By.xpath("//ul[@class='uk-nav uk-nav-dropdown']//li//a[@class='js-logout-link']");


    public void enterProfileInfo() throws InterruptedException {
       // Thread.sleep(10000);
        MainMethods.switchWindow();
        MainMethods.clickOnButton(btnDoYouHaveCar);
        MainMethods.type(tfFirstName, "Magdalena");
        MainMethods.type(tfLastName,"Stojanovic");
        MainMethods.type(tfAddress, "Radoja Domanovica 12");
        MainMethods.type(tfCity,"Kragujevac");
        MainMethods.clickOnButton(selectCity);
        MainMethods.type(tfZip,"34000");
       /* MainMethods.clickOnButton(cbRegion);
        MainMethods.clickOnButton(clickSumadijski);
        MainMethods.clickOnButton(cbCountry);
        MainMethods.clickOnButton(clickSerbia);*/
        MainMethods.type(tfPhoneNum, "123456789");

    }
    public void clickSave(){
        MainMethods.clickOnButton(btnSave);
    }
    public void verifySave(){
        MainMethods.waitElementToBeVisible(verSuccess);
    }
    public void clickLogOut(){
        MainMethods.getMouseHover(myProfile);
        MainMethods.clickOnButton(selectLogOut);
    }


}
