package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class SelectablePage extends PropertyFile {

    public By item3 = By.xpath("//li[contains(.,'Item 3')]");
    public By item5 = By.xpath("//li[contains(.,'Item 5')]");

    public void select(){
        MainMethods.selectMultipleActions(item3,item5);
        getDriver().navigate().to("https://demoqa.com/category/interactions/");
    }

}
