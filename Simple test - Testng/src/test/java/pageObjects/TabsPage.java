package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TabsPage extends PropertyFile {


    public By tabNunc = By.xpath("//li[@aria-labelledby='ui-id-1']");
    public By tabProin = By.xpath("//li[@aria-labelledby='ui-id-2']");
    public By tabAenean = By.xpath("//li[@aria-labelledby='ui-id-3']");

    public By linkNunc = By.xpath("//a[@id='ui-id-1']");
    public By linkProin = By.xpath("//a[@id='ui-id-2']");
    public By linkAenean = By.xpath("//a[@id='ui-id-3']");

    public By textNunc = By.xpath("//p[contains(.,'Proin elit arcu')]");
    public By textProin = By.xpath("//p[contains(.,'Morbi tincidunt')]");
    public By textAenean = By.xpath("//p[contains(.,'Mauris eleifend est et turpis')]");

    public void clickTabNunc(){
        MainMethods.clickOnButton(linkNunc);

    }
    public void verifyTextNum(){
        String s = MainMethods.expanded(tabNunc);
        Assert.assertTrue(s.equals("true"));
        MainMethods.waitElementToBeVisible(textNunc);
    }
    public void clickTabProin(){
        MainMethods.clickOnButton(linkProin);

    }
    public void verifyTextProin(){
        String s = MainMethods.expanded(tabProin);
        Assert.assertTrue(s.equals("true"));
        MainMethods.waitElementToBeVisible(textProin);
    }
    public void clickTabAenean(){
        MainMethods.clickOnButton(linkAenean);

    }
    public void verifyTextAenean(){
        String s = MainMethods.expanded(tabAenean);
        Assert.assertTrue(s.equals("true"));
        MainMethods.waitElementToBeVisible(textAenean);
        getDriver().navigate().to("https://demoqa.com/category/widgets/");
    }
}
