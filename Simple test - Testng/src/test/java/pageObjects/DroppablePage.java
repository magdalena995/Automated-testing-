package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class DroppablePage extends PropertyFile {

    public By btnDrag = By.xpath("//div[@id='draggable']");
    public By btnDrop = By.xpath("//div[@id='droppable']");
    public By txtDrop = By.xpath("//p[contains(.,'Dropped!')]");

    public void dragAndDropEl(){
        MainMethods.dragAndDropActions(btnDrag,btnDrop);
    }
    public void verifyDragAndDrop(){
        MainMethods.waitElementToBeVisible(txtDrop);
        getDriver().navigate().to("https://demoqa.com/category/interactions/");
    }
}
