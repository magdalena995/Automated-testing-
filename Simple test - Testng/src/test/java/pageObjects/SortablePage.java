package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;



public class SortablePage extends PropertyFile {

    public By item1 = By.xpath("//li[contains(.,'Item 1')]");
    public By item3 = By.xpath("//li[contains(.,'Item 3')]");
    public By item5 = By.xpath("//li[contains(.,'Item 5')]");
    public By item7 = By.xpath("//li[contains(.,'Item 7')]");


    public void moveItem1(){
        MainMethods.dragAndDropActions(item1,item7);
    }
    public void moveItem3(){
        MainMethods.dragAndDropActions(item3,item5);
        getDriver().navigate().to("https://demoqa.com/category/interactions/");
    }



}
