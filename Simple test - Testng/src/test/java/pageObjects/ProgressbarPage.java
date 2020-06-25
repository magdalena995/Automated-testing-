package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class ProgressbarPage extends PropertyFile {
    public By progress= By.xpath("//div[@class='ui-progressbar-value ui-corner-left ui-widget-header']");

    public void changeProgress(){
        MainMethods.changeAttr(progress);
        getDriver().navigate().to("https://demoqa.com/category/widgets/");
    }
}
