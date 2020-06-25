package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class MenuPage extends PropertyFile {

    public By books = By.xpath("//div[@id='ui-id-2']");
    public By clothing = By.xpath("//div[@id='ui-id-3']");
    public By electronics = By.xpath("//div[@id='ui-id-4']");
    public By carHifi = By.xpath("//div[@id='ui-id-6']");
    public By music = By.xpath("//div[@id='ui-id-9']");
    public By rock = By.xpath("//div[@id='ui-id-10']");
    public By alternative = By.xpath("//div[@id='ui-id-11']");

    public void hoverBooks(){
        MainMethods.getMouseHover(books);
    }
    public void hoverClothing(){
        MainMethods.getMouseHover(clothing);
    }
    public void hoverElectronics(){
        MainMethods.getMouseHover(electronics);
        MainMethods.clickOnButton(carHifi);
    }
    public void hoverMusic(){
        MainMethods.getMouseHover(music);
        MainMethods.clickOnButton(rock);
        MainMethods.clickOnButton(alternative);
    }


}
