package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class IFramePage extends PropertyFile {

    public By search = By.xpath("//input[@name='s']");
    public By btnDatePicker = By.xpath("//a[@href='https://demoqa.com/datepicker/']");
    public By tfDate = By.xpath("//input[@id='datepicker']");
    public By left = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']");
    public By day = By.xpath("//a[contains(.,'13')]");

    public void enterSearchFrame1(){
        getDriver().switchTo().frame(getDriver().findElement(By.id("IF1")));
        MainMethods.typeEnter(search,"Appium");
        getDriver().switchTo().defaultContent();
    }
    public void enterFrame2(){
        getDriver().switchTo().frame(getDriver().findElement(By.id("IF2")));
        MainMethods.clickOnButton(btnDatePicker);
        MainMethods.clickOnButton(tfDate);
        MainMethods.clickOnButton(left);
        MainMethods.clickOnButton(day);
        getDriver().switchTo().defaultContent();
    }
}
