package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class ToolTipAgePage extends PropertyFile {
    public static String age = "24";

    public By tfAge = By.xpath("//input[@id='age']");
    public By ttAge = By.xpath("//*[@id='ui-id-1']/div");

    public void enterAge(){
        MainMethods.type(tfAge,age);
    }
    public void hoverTextAge(){
        MainMethods.getMouseHover(tfAge);
    }
    public void verifyToolTip(){
        MainMethods.waitElementToBeVisible(ttAge);
        getDriver().navigate().to("https://demoqa.com/category/widgets/");
    }
}
