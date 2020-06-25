package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class InteractionsPage extends PropertyFile {

    public By btnSortable = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/sortable/']");
    public By btnSelectable = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/selectable/']");
    public By btnResizable = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/resizable/']");
    public By btnDroppable = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/droppable/']");
    public By btnDraggable = By.xpath("//div[@class='demo-frame']//a[@href='https://demoqa.com/draggable/']");

    public void clickSortable(){
        MainMethods.clickOnButton(btnSortable);
    }
    public void clickSelectable(){
        MainMethods.clickOnButton(btnSelectable);
    }
    public void clickResizable(){
        MainMethods.clickOnButton(btnResizable);
    }
    public void clickDroppable(){
        MainMethods.clickOnButton(btnDroppable);
    }
    public void clickDaggable(){
        MainMethods.clickOnButton(btnDraggable);
    }



}
