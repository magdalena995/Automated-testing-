package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class ResizablePage extends PropertyFile {

    public By resElement = By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']");

    public void resizable(){
        MainMethods.moveElementOrResize(resElement,100,100);
        getDriver().navigate().to("https://demoqa.com/category/interactions/");
    }
}
