package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class DialogPage extends PropertyFile {

    public By dialogMove = By.xpath("//span[@id='ui-id-1']");
    public By dialogRes = By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']");
    public By dialogClose = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");

    public void dragDialog(){

            MainMethods.moveElementOrResize(dialogMove, 100, 100);

    }
    public void resizeDialog(){
        MainMethods.moveElementOrResize(dialogRes,100,100);

    }
    public void closeDialog(){
        MainMethods.clickOnButton(dialogClose);
        getDriver().navigate().to("https://demoqa.com/category/widgets/");
    }
}
